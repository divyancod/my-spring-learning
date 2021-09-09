<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 08-09-21
  Time: 03:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Profile</title>
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"
    />

    <link
            href="https://fonts.googleapis.com/icon?family=Material+Icons"
            rel="stylesheet"
    />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <style>
        .errors {
            color: #ef6969;
        }
    </style>
</head>
<body>
<h4 style="text-align: center">Bug details</h4>
<div class="container">
    <div class="row">
        <div style="width: 60%; margin: 0 auto">
            <form:form cssClass="col s12" method="post" action="confirm-add-bug" modelAttribute="bugdetail">
                <div class="row">
                    <div class="input-field col s12">
                        <form:hidden path="bugid"/>
                        <form:input path="bugname" id="issue_name" type="text"/>
                        <form:label path="bugname" for="issue_name">Issue Name</form:label>
                    </div>

                    <div class="input-field col s12">
                <form:textarea path="bugdesc"
                        id="textarea2"
                        class="materialize-textarea"
                        data-length="120"
                />
                        <form:label path="bugdesc" for="textarea2">Issue Description</form:label>
                    </div>

                    <div class="input-field col s12">
                        <form:input path="platform" id="issue_platform" type="text"/>
                        <form:label path="platform" for="issue_platform">Issue Platform</form:label>
                    </div>

                    <div class="input-field col s12">
                        <form:select  path="priorityNumber">
                            <form:option value="1">Normal</form:option>
                            <form:option value="2">Low</form:option>
                            <form:option value="3">High</form:option>
                            <form:option value="4">Urgent</form:option>
                        </form:select>
                        <form:label path="">Issue Priority</form:label>
                    </div>

                    <div class="input-field col s12">
                        <form:select path="statusNumber">
                            <form:option value="1">Open</form:option>
                            <form:option value="2">Resolved</form:option>
                            <form:option value="3">Conflict</form:option>
                            <form:option value="4">Duplicate</form:option>
                            <form:option value="5">Closed</form:option>
                        </form:select>
                        <form:label path="">Issue Status</form:label>
                    </div>

                    <div id="div" class="row center">
                        <button
                                class="btn waves-effect waves-light green"
                                type="submit"
                                style="text-transform: none"
                        >
                            Add Bug
                        </button>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
</div>
<script>
    $(document).ready(function () {
        $("select").material_select();
        $("textarea#textarea2").characterCounter();
    });
</script>
<script src=
                "https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js">
</script>
</body>
</html>
