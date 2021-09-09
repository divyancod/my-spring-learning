<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
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
<h2 style="text-align: center">List of Bugs Assigned</h2>

<div class="container">
    <div class="row">
        <div class="row center">
            <div class="col s6">
                <a href="add-bug" class="waves-effect waves-light btn" style="text-transform: none">Add Bug</a>
            </div>
            <div class="col s6">
                <form:form method="post" action="/logout">
                    <button class="waves-effect waves-light btn red" style="text-transform: none">Logout</button>
                </form:form>
            </div>
        </div>
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Issue name</th>
                <th scope="col">Issue priority</th>
                <th scope="col">Issue status</th>
                <th scope="col">Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="bug" items="${bugsList}">
                <tr>
                    <th scope="row">${bug.bugid}</th>
                    <td>${bug.bugname}</td>
                    <td>${bug.priority}</td>
                    <td>${bug.status}</td>
                    <td>
                        <ul style="list-style-type: none;">
                            <li>
                                <form action="show-bug" method="get">
                                    <button name="bugid" value="${bug.bugid}" class="btn waves-effect waves-light green"
                                            type="submit"
                                            style="text-transform: none">
                                        View
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
