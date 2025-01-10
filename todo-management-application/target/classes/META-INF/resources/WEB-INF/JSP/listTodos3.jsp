<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="in.vtech.springboot.web.todo.Todo" %> <!-- Correct package path for Todo -->
<%@ page import="java.time.format.DateTimeFormatter" %>
--%>
<html>
<head>
    <title>Todo List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            background-color: hsl(89, 43%, 51%);
            border: 1px solid red;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #80ced6;
        }
    </style>
</head>
<body>
	<div>Welcome ${name}!</div>
	<hr>
	<h1>Your Todos are</h1>
 	<table>
 	<thead>
        <tr>
            <th>Task ID</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Status</th>
        </tr>
    </thead>
    <tbody>
   	<c:forEach items="${todos}" var="todo">
   	<tr>
   		<td>${todo.id}</td>
   		<td>${todo.description}</td>
   		<td>${todo.targetDate}</td>
   		<td>${todo.done}</td>
   	</tr>
   	</c:forEach>
    
    </tbody>
    </table>
</body>
</html>


<%-- 
    <h2>Todo List</h2>
    <table>
        <tr>
            <th>Task ID</th>
            <th>Username</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Status</th>
        </tr>
        <%
            // Assuming you have a list of Todo objects in the request attribute
            List<Todo> todos = (List<Todo>) request.getAttribute("todos");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            
            // Iterate over the todos list and display the values in a table
            for (Todo todo : todos) {
        %>
        <tr>
            <td><%= todo.getId() %></td>
            <td><%= todo.getUsername() %></td>
            <td><%= todo.getDescription() %></td>
             <td><%= todo.getTargetData().format(formatter) %></td> <!-- Corrected to getTargerData() -->
            <td><%= todo.isDone() ? "Completed" : "Not Completed" %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>

--%>