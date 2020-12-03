<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

   <head>
      <title>List of Products</title>
      
      <!-- reference our style sheet -->

    <link type="text/css" rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/css/style.css">
   </head>
   
   <body>
   
      <div id="wrapper">
         <div id="header">
            <h2>Welcome to Product Application</h2>
         </div>
      </div>
      
      <div id="container">
         <div id="content">
         
          <!-- put new button: Add Product -->
          
          <input type="button" value="Add Product"
      onclick="window.location.href='showFormForAdd'; return false;"
      class="add-button"
      />
         
            <!-- add html table here -->
            
            <table>
               <tr>
                  <th>Product Name</th>
                  <th>Description</th>
                  <th>Price</th>
                  <th>Action</th>
               </tr>
               
               <!-- loop over and print products -->
               <c:forEach var="tempProduct" items="${products}">
               
               <!-- construct "update" link with product id -->
               <c:url var="updateLink" value="/product/showFormForUpdate">
               <c:param name="productId" value="${tempProduct.id}"/>
               </c:url>
               
               <!-- construct "delete" link with product id -->
               <c:url var="deleteLink" value="/product/delete">
               <c:param name="productId" value="${tempProduct.id}"/>
               </c:url>

            <tr>
                <td> ${tempProduct.productName}</td>
                <td> ${tempProduct.description}</td>
                <td> ${tempProduct.price}</td>
                
                <td>
                   <a href="${updateLink}">Update</a>
                   |
                   <a href="${deleteLink}">Delete</a>
                </td>
            </tr>

          </c:forEach>
            </table>
         </div>
      </div>
   </body>

</html>