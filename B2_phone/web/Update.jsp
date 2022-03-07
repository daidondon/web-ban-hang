<%-- 
    Document   : Update
    Created on : Mar 7, 2022, 10:29:59 PM
    Author     : HDC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="update" method="post">
            <table>
                <tr>
                    <td>ID</td>
                    <td>
                        <input type="text" name="id" readonly value = "${st.id}">
                    </td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td>
                        <input value="${st.name}" type="text" name="name" >
                    </td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td>
                        <input value="${st.price}" type="text" name="price" >
                    </td>
                </tr>
                <tr>
                    <td>DateEX</td>
                    <td><input value="${st.dateEX}" type="text" name="dateEX"></td>
                </tr>
                <tr>
                    <td>Des</td>
                    <td><input value="${st.Des}" type="text" name="Des"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">Update</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
