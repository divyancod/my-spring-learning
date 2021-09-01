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
                <td>${student.getId()}</td>
            </tr>
            <tr>
                <td>Name :</td>
                <td>${student.getName()}</td>
            </tr>
            <tr>
                <td>Phone :</td>
                <td>${student.getPhone()}</td>
            </tr>
            <tr>
                <td>Email :</td>
                <td>${student.getName()}gmail.com</td>
            </tr>
            <tr>
                <td>College :</td>
                <td>-</td>
            </tr>
            <tr>
                <td>Location :</td>
                <td>${student.getLocation()}</td>
            </tr>
            </tbody>
        </table>
        <h5>Course Details : </h5>
        <table>
            <tbody>
            <tr>
                <td>Course :</td>
                <td>-</td>
            </tr>
            <tr>
                <td>Batch :</td>
                <td>-</td>
            </tr>
            <tr>
                <td>Technical Skills :</td>
                <td>-</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>