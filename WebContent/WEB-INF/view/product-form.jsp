<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Save Product</title>

    <link type="text/css" rel="stylesheet"
         href="${pageContext.request.contextPath}/resources/css/style.css">

         <link type="text/css" rel="stylesheet"
         href="${pageContext.request.contextPath}/resources/css/add-product-style.css">
</head>
<body>
 <div id="wrapper">
       <div id="header">
           <h2>Welcome to Product Application</h2>
       </div>
    </div>

    <div id="container">
       <h3>Save Product</h3>

        <form:form action="saveProduct" modelAttribute="product" method="POST">

            <table>
                <tbody>
                <tr>
                   <td><label>Product Name </label></td>
                   <td><form:input path="productName"/></td>
                </tr>

                <tr>
                   <td><label>Description </label></td>
                   <td><form:input path="description"/></td>
                </tr>

                <tr>
                   <td><label>Price </label></td>
                   <td><form:input path="price"/></td>
                </tr>

                <tr>
                   <td><label></label></td>
                   <td><input type="submit" value="Save" class="save"/></td>
                </tr>

                </tbody>
            </table>

        </form:form>

        <div style="clear; both;"></div>

        <p>
           <a href="${pageContext.request.contextPath}/product/list">Back to List</a>
        </p>

    </div>

</body>	</body>

</html> 	