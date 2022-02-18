<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>

    <!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="/bootstrap-5.1.3-dist/styles/success.css">
<style>
   <%@include  file= "/WEB-INF/views/form.css"  %>
</style>

    
    <title>Hello, world!</title>
  </head>
  <body>

      <div class="container-fluid">
        
             <div class="row" >
                <div class="col text-success text-center mt-4"><h2>Regirstation Form</h2> </div>
            </div>
              

            <div class="row  justify-content-center">

                    <div class="col-6 ">
                        <form action="form1" method="post">
                           
                              <div class="col   text-info">
                                 <label  for="exampleInputEmail" class="formlabel">Name </label> 
                                   <input type="text" 
                                    class="form-control form-label"
                                    id="exampleInputEmail"
                                    placeholder="Enter Your Name"
                                    name="userName">
                                </div>  
                                  
                                <div class="mb-4">
                                    <label  for="exampleInputEmail" class="formlabel">Email Address</label>
                                    <input type="email" 
                                            class="form-control form-label"
                                            id="exampleInputEmail"
                                            placeholder="Enter Your Email"
                                            name="emailaddress"      >
                                </div>

                                    <div class="mb-4">
                                        <label  for="exampleInputEmail" class="formlabel">Password</label>
                                        <input type="password" 
                                                class="form-control"
                                                id="exampleInputEmail"
                                                placeholder="create password"
                                                name="passwd"      >
                                    </div>
                                           
                                           <div class="text-center mb-5" id="button1">
                                              <button class="btn btn-success">Sumbit</button>
                                           </div>
                                 
                           </form>  
                   </div>
      </div>

      </div>

      
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

  </body>
</html>