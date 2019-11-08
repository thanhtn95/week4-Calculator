<%--
  Created by IntelliJ IDEA.
  User: z-one
  Date: 11/8/19
  Time: 8:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    button {
        margin-right: 25px;
    }
</style>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="calculate">
    <fieldset style="width: fit-content; height: fit-content">
        <legend><h2>Calculator</h2></legend>
        <p><input type="number" name="operand1" value="${operand1}" style="margin-right: 20px">
            <input type="number" name="operand2" value="${operand2}" style="margin-right: 20px">
        </p>
        <p>
            <button type="submit" name="operator" value="+">Add(+)</button>
            <button type="submit" name="operator" value="-">Subtraction(-)</button>
            <button type="submit" name="operator" value="*">Multiply(*)</button>
            <button type="submit" name="operator" value="/">Division(/)</button>
        </p>
    </fieldset>
</form>
<p>
<h2 style="color: red">Result: ${result}</h2></p>
</body>
</html>
