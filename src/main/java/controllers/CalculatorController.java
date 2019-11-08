package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
    public ModelAndView Calculate(@RequestParam("operand1") double operand1, @RequestParam("operand2") double operand2, @RequestParam("operator") String operator) {
        String result = "";
        switch (operator) {
            case "+":
                result = operand1 + operand2 + "";
                break;
            case "-":
                result = operand1 - operand2 + "";
                break;
            case "*":
                result = operand1 * operand2 + "";
                break;
            case "/":
                if (operand2 == 0) {
                    result = "Can't divide by 0";
                } else {
                    result = operand1 / operand2 + "";
                }
        }
        ModelAndView modelAndView = new ModelAndView("index", "result", result);
        modelAndView.addObject("operand1", operand1);
        modelAndView.addObject("operand2", operand2);
        return modelAndView;
    }
}
