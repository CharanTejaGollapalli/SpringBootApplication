<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="in.vtech.springboot.web.todo.Todo" %> <!-- Correct package path for Todo -->
<%@ page import="java.time.format.DateTimeFormatter" %>
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