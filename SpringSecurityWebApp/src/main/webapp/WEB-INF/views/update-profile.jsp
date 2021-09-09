<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 07-09-21
  Time: 09:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Update Profile</title>
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"
    />
    <link
            href="https://fonts.googleapis.com/icon?family=Material+Icons"
            rel="stylesheet"
    />
    <style>
        .errors {
            color: #ef6969;
        }
    </style>
</head>
<body>
<h4 style="text-align: center">Update Profile</h4>
<div class="container">
    <div class="row">
        <div style="width: 60%; margin: 0 auto">
            <form:form method="post" action="update-user-profile" modelAttribute="employee" cssClass="col s12">
                <div class="row">
                    <div class="input-field col s12">
                        <form:input path="name" id="user_name" type="text"/>
                        <form:label path="name" for="user_name">Name</form:label>
                    </div>

                    <div class="input-field col s12">
                        <form:input path="position"  id="user_role" type="text" disabled="true"/>
                        <form:label path="position" for="user_role">Position</form:label>
                    </div>

                    <div class="input-field col s12">
                        <form:input path="email" id="user_email" type="text" disabled="true"/>
                        <form:label path="email" for="user_email">Email ID</form:label>
                    </div>

                    <div class="input-field col s12">
                        <form:input path="phone" id="user_phone" type="text"/>
                        <form:label path="phone" for="user_phone">Phone Number</form:label>
                    </div>

                    <div class="input-field col s12">
                        <form:input path="location" id="user_location" type="text" />
                        <form:label path="location" for="user_location">Location</form:label>
                    </div>

                    <div class="input-field col s12">
                        <form:input path="college" id="user_college" type="text" />
                        <form:label path="college" for="user_college">College</form:label>
                    </div>

                    <div class="input-field col s12">
                        <form:input path="batch" id="user_batch" type="text" />
                        <form:label path="batch" for="user_batch">Batch</form:label>
                    </div>

                    <div class="input-field col s12">
                        <form:input path="tskills" id="user_tskills" type="text" />
                        <form:label path="tskills" for="user_tskills">Technical Skills</form:label>
                    </div>

                    <div id="div" class="row center">
                        <button
                                class="btn waves-effect waves-light green"
                                type="submit"
                                style="text-transform: none"
                        >
                            Update
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
