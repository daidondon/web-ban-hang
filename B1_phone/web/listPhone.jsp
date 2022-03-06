<%-- 
    Document   : listPhone
    Created on : Mar 3, 2022, 7:46:49 PM
    Author     : HDC
--%>

<%@page import="java.util.List"%>
<%@page import="model.listphone"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab02</title>
    </head>
    <body>
        
        <div>
            <style>
                table{
                    border:1px solid black;
                }
                th{
                    border:1px solid black;
                }
                td{
                    border:1px solid black;
                }
                td{
                    border:1px solid black;
                }
                td{
                    border:1px solid black;
                }
            </style>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>PRICE</th>
                    <th>DATE</th>
                    <th>DES</th>
                </tr>
                <% 
                    List<listphone> list = (List<listphone>) request.getAttribute("data");
                    for (listphone o : list) {
                            %>
                            <tr>
                                <td><%= o.getId()%></td>
                                <td><%= o.getName()%></td>
                                <td><%= o.getPrice()%></td>
                                <td><%= o.getDateEx()%></td>
                                <td><%= o.getDes()%></td>
                            </tr>        
                            <%     }
                %>
                
                


            </table>
        </div>
    </body>
</html>
