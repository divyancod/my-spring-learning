<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 06-09-21
  Time: 08:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <title>Login</title>
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"
    />
    <link
            href="https://fonts.googleapis.com/icon?family=Material+Icons"
            rel="stylesheet"
    />
</head>
<body>
<div class="container">
    <div class="row">
        <h4 class="center-align">Sign up</h4>
        <div style="width: 60%; margin: auto auto">
            <div>
                <form class="col s12">
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="email" type="email"/>
                            <label for="email">Email ID</label>
                        </div>
                        <div class="input-field col s12">
                            <input id="password" type="password"/>
                            <label for="password">Password</label>
                        </div>
                        <div class="input-field col s12">
                            <input id="repassword" type="password"/>
                            <label for="repassword">Confirm password</label>
                        </div>
                        <div class="input-field col s12">
                            <input id="phone" type="text"/>
                            <label for="phone">Phone number</label>
                        </div>
                        <div class="input-field col s12">
                            <select>
                                <option value="" disabled selected>Select your role</option>
                                <option value="1">Instructor</option>
                                <option value="2">Student</option>
                                <option value="3">Management</option>
                            </select>
                            <label>Role</label>
                            <p>
                                Note : Role will be verified for instructor and management
                                by admin.
                            </p>
                        </div>
                        <div id="div" class="row center">
                            <button
                                    class="btn waves-effect waves-light"
                                    type="submit"
                                    style="text-transform: none"
                            >
                                Sign up
                            </button>
                        </div>
                    </div>
                </form>
            </div>
            <p>Already have account? <a href="/login">Log in Here</a></p>
        </div>
    </div>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script>
    document.addEventListener("DOMContentLoaded", function () {
        var elems = document.querySelectorAll("select");
        var instances = M.FormSelect.init(elems);
    });
</script>
</body>
</html>
