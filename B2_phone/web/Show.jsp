<%-- 
    Document   : Show
    Created on : Mar 7, 2022, 10:25:41 PM
    Author     : HDC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <table border="1px solid black">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>dateEX</th>
                    <th>Des</th>
                </tr>
            <c:forEach items="${ListS}" var="x">
                <tr>
                    <td>${x.id}</td>
                    <td>${x.name}</td>
                    <td>${x.price}</td>
                    <td>${x.dateEX}</td>
                    <td>${x.Des}</td>
                    <td>
                        <a href="update?sid=${x.id}">update</a>
                        <a href="#" onclick="Mess(${x.id})">delete</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
            <a href="Add.jsp">Create newPhone</a>    
    </body>
    <script>
        function Mess(id){
            var option = confirm('Are you sure to delete');
            if(option === true){
                window.location.href = 'delete?sid='+id;
                
            }
        }
    </script>

</html>
