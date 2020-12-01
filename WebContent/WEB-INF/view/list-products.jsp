<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

   <head>
      <title>List of Products</title>
      
   </head>
   
   <body>
   
      <div id="wrapper">
         <div id="header">
            <h2>Welcome to Product Application</h2>
         </div>
      </div>
      
      <div id="container">
         <div id="content">
            <!-- add html table here -->
            
            <table>
               <tr>
                  <th>Product Name</th>
                  <th>Description</th>
                  <th>Price</th>
               </tr>
               
               <!-- loop over and print products -->
               <c:forEach var="tempProduct" items="${products}">

            <tr>
                <td> ${tempProduct.productName}</td>
                <td> ${tempProduct.description}</td>
                <td> ${tempProduct.price}</td>
            </tr>

          </c:forEach>
            </table>
         </div>
      </div>
   </body>

</html>