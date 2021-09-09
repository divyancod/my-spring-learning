<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 01-09-21
  Time: 09:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Student Details</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<h2 style="text-align: center">Student Info</h2>
<div class="container">
    <div class="row">
        <h5>Personal Details : </h5>
        <table>
            <tbody>
            <tr>
                <td>Student Unique ID :</td>
                <td>${employee.getId()}</td>
            </tr>
            <tr>
                <td>Name :</td>
                <td>${employee.getName()}</td>
            </tr>
            <tr>
                <td>Phone :</td>
                <td>${employee.getPhone()}</td>
            </tr>
            <tr>
                <td>Email :</td>
                <td>${employee.getEmail()}</td>
            </tr>
            <tr>
                <td>College :</td>
                <td>${employee.college}</td>
            </tr>
            <tr>
                <td>Location :</td>
                <td>${employee.getLocation()}</td>
            </tr>
            </tbody>
        </table>
        <h5>Course Details : </h5>
        <table>
            <tbody>
            <tr>
                <td>Course :</td>
                <td>${employee.course}</td>
            </tr>
            <tr>
                <td>Batch :</td>
                <td>${employee.batch}</td>
            </tr>
            <tr>
                <td>Technical Skills :</td>
                <td>${employee.tskills}</td>
            </tr>
            </tbody>
        </table>
        <div style="margin: 10px;" class="center-align">
            <form action="user-profile" method="get">
                <button name="id" value="${employee.id}" class="btn waves-effect waves-light"
                        type="submit"
                        style="text-transform: none">
                    View
                </button>
            </form>
        </div>
    </div>
</div>
</body>
</html>