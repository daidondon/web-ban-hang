<%-- 
    Document   : Show
    Created on : Mar 7, 2022, 10:25:41 PM
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
        <form action="add" method="post">
            <table>
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" name="name">
                    </td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td>
                        <input type="text" name="price">
                    </td>
                </tr>
                <tr>
                    <td>DateEX</td>
                    <td><input type="text" name="DateEX"</td>
                </tr>
                <tr>
                    <td>Des</td>
                    <td><input type="text" name="Des"</td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">Add phone</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
