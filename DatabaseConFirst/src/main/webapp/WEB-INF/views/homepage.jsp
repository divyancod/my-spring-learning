<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 31-08-21
  Time: 08:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
    <!-- CSS only -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <style>
        li {
            float: left;
            padding-right: 5px;
        }
    </style>
</head>
<body>
<h2 style="text-align: center">List of Students</h2>

<div class="container">
    <div class="row">
        <div id="div" class="row center">
            <a href="add-student" class="waves-effect waves-light btn" style="text-transform: none">Add Students</a>
        </div>
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">Phone</th>
                <th scope="col">Location</th>
                <th scope="col">Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="student" items="${totalStudents}">
                <tr>
                    <th scope="row">${student.id}</th>
                    <td>${student.name}</td>
                    <td>${student.phone}</td>
                    <td>${student.location}</td>
                    <td>
                        <ul style="list-style-type: none;">
                            <li>
                                <form action="show-student" method="get">
                                    <button name="id" value="${student.id}" class="btn waves-effect waves-light"
                                            type="submit"
                                            style="text-transform: none">
                                        View
                                    </button>
                                </form>
                            </li>
                            <li>
                                <form action="update-data" method="post">
                                    <button name="id" value="${student.id}" class="btn waves-effect waves-light"
                                            type="submit"
                                            style="text-transform: none">
                                        Update
                                    </button>
                                </form>
                            </li>
                            <li>
                                <form action="delete-student" method="post">
                                    <button name="id" value="${student.id}" class="btn waves-effect waves-light"
                                            type="submit"
                                            style="text-transform: none">
                                        Delete
                                    </button>
                                </form>
                            </li>
                        </ul>

                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
        crossorigin="anonymous"></script>
</body>
</html>
