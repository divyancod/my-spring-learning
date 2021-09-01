<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 31-08-21
  Time: 11:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<h2 style="text-align: center">Add Student Here</h2>
<div class="container">
    <div class="row">
        <div style="width: 60%;margin: auto auto;">
            <form:form action="process-data" method="GET" modelAttribute="studentModel">
                <div class="row">
                    <div class="input-field col s12">
                        <form:hidden path="id"/>
                        <form:input path="name" id="name" class="validate"/>
                        <form:label for="name" path="name">Name</form:label>
                    </div>
                    <div class="input-field col s12">
                        <form:input path="phone" id="phone" class="validate"/>
                        <form:label path="phone" for="phone">Phone</form:label>
                    </div>
                    <div class="input-field col s12">
                        <form:input path="location" id="loc" class="validate"/>
                        <form:label path="location" for="loc">Location</form:label>
                    </div>
                    <div id="div" class="row center">
                        <button class="btn waves-effect waves-light" type="submit" style="text-transform: none">Submit
                            <i class="material-icons left">add</i>
                        </button>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
