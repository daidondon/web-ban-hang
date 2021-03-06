<%-- 
    Document   : blog-single
    Created on : Mar 21, 2022, 2:14:39 AM
    Author     : HDC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <title>DaiAn Shop | Blog Single</title>
    
    <!-- Font awesome -->
    <link href="css/font-awesome.css" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">   
    <!-- SmartMenus jQuery Bootstrap Addon CSS -->
    <link href="css/jquery.smartmenus.bootstrap.css" rel="stylesheet">
    <!-- Product view slider -->
    <link rel="stylesheet" type="text/css" href="css/jquery.simpleLens.css">    
    <!-- slick slider -->
    <link rel="stylesheet" type="text/css" href="css/slick.css">
    <!-- price picker slider -->
    <link rel="stylesheet" type="text/css" href="css/nouislider.css">
    <!-- Theme color -->
    <link id="switcher" href="css/theme-color/default-theme.css" rel="stylesheet">
    <!-- Top Slider CSS -->
    <link href="css/sequence-theme.modern-slide-in.css" rel="stylesheet" media="all">

    <!-- Main style sheet -->
    <link href="css/style.css" rel="stylesheet">    

    <!-- Google Font -->
    <link href='https://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  

  </head>
  <body>
   
   <!-- wpf loader Two -->
    <div id="wpf-loader-two">          
      <div class="wpf-loader-two-inner">
        <span>Loading</span>
      </div>
    </div> 
    <!-- / wpf loader Two -->       
 <!-- SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#"><i class="fa fa-chevron-up"></i></a>
  <!-- END SCROLL TOP BUTTON -->

  <!-- Start header section -->
  <header id="aa-header">
    <!-- start header top  -->
    <div class="aa-header-top">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="aa-header-top-area">
              <!-- start header top left -->
              <div class="aa-header-top-left">
               
                <!-- start cellphone -->
                <div class="cellphone hidden-xs">
                  <p><span class="fa fa-phone"></span>: 0915301665 - 0915300970 - 0942560232</p>
                </div>
                <!-- / cellphone -->
              </div>
              <!-- / header top left -->
              <div class="aa-header-top-right">
                <ul class="aa-head-top-nav-right">
                    <c:if test="${sessionScope.acc.isAdmin ==1}">  
                  <li><a href="load">Amin</a></li>
                    </c:if>
                  <li><a href="account.jsp">????ng k??</a></li>
                  <c:if test="${sessionScope.acc !=null}">
                  <li><a href="logout">????ng xu???t</a></li>
                  </c:if>
                  <c:if test="${sessionScope.acc ==null}">
                   <li><a href="account.jsp">????ng nh???p</a></li>
                  </c:if>
                 
                  
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- / header top  -->

    <!-- start header bottom  -->
    <div class="aa-header-bottom">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="aa-header-bottom-area">
              <!-- logo  -->
              <div class="aa-logo">
                <!-- Text based logo -->
                <!-- img based logo -->
                 <a href="index.jsp"><img src="img/logo.jpg" alt="logo img" width=280px height=100px></a> 
              </div>
              <!-- / logo  -->

              <!-- search box -->
              <div class="aa-search-box">
                <form action="">
                  <input type="text" name="" id="" placeholder="Search here">
                  <button type="submit"><span class="fa fa-search"></span></button>
                </form>
              </div>
              <!-- / search box -->             
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- / header bottom  -->
  </header>
  <!-- / header section -->
  <!-- menu -->
  <section id="menu">
    <div class="container">
      <div class="menu-area">
        <!-- Navbar -->
        <div class="navbar navbar-default" role="navigation">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>          
          </div>
          <div class="navbar-collapse collapse">
            <!-- Left nav -->
            <ul class="nav navbar-nav">
                <li><a href="blog-archive-2.jsp">H????ng n??n TM</a></li>
                <li><a href="blog-archive-2.jsp">H????ng n??n tr???m</a></li>
                <li><a href="blog-archive-2.jsp">Tr???m n???</a></li>
                <li><a href="blog-archive-2.jsp">Tr?? tr???m</a></li>
                <li><a href="blog-archive-2.jsp">Tr???m thi???n</a></li>
                
                <li><a href="blog-archive-2.jsp">Blog</a></li>
              
                <li><a href="contact.jsp">Contact</a></li>

            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>       
    </div>
      
  </section>
  <!-- / menu -->
 
  <!-- catg header banner section -->
  <section id="aa-catg-head-banner">
   <img src="img/fashion/image2.jpg" alt="fashion img">
   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Blog Details</h2>
        <ol class="breadcrumb">
          <li><a href="index.jsp">Home</a></li>         
        </ol>
      </div>
     </div>
   </div>
  </section>
  <!-- / catg header banner section -->

  <!-- Blog Archive -->
  <section id="aa-blog-archive">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="aa-blog-archive-area">
            <div class="row">
              <div class="col-md-9">
                <!-- Blog details -->
                <div class="aa-blog-content aa-blog-details">
                  <article class="aa-blog-content-single">                        
                    <h2><a href="#">Tr???m h????ng ?????i v???i ?????i s???ng t??m linh</a></h2>
                     <div class="aa-article-bottom">
                      <div class="aa-post-author">
                        Posted By <a href="#">Nguyen Kien Cuong</a>
                      </div>
                      <div class="aa-post-date">
                        June 26, 2016
                      </div>
                    </div>
                    <figure class="aa-blog-img">
                      <a href="#"><img src="img/fashion/image.png" alt="fashion img"></a>
                    </figure>Tr???m c?? tu???i th??? h??ng tr??m n??m, l?? s???n ph???m c???c k??? qu?? hi???m, ch??ng h???p th??? linh kh?? c???a tr???i ?????t ??em ?????n cho ng?????i s??? h???u nh???ng ??i???u may m???n b??nh an, s???c kh???e d???i d??o, cu???c s???ng h???nh ph??c, l??m ??n ph??t ?????t. Vi???c k???t h???p Tr???m H????ng v???i phong th???y c?? th??? xua ??u???i ???????c t?? kh??, t???o ra ???????c nh???ng ??i???u may m???n trong cu???c s???ng.Gi??p ch??? nh??n thu???n l???i trong khoa c???, c??ng vi???c th??ng ti???n thu???n l???i, kinh doanh bu??n b??n hanh th??ng. Kh??i Tr???m ???????c d??ng nh?? m???t ch???t tr??? t??, u??? kh??.
</p>
                    <p></p>
                    <blockquote>
                      T?? kh?? l?? g??: l?? m??i h??i , kh?? kh??ng t???t cho s???c kho??? con ng?????i nh?? r??c ????? trong nh?? l??u ng??y, hoa qu??? th???i, ?????ng v???t ch???t, ng?????i v???a m???t ??ang trong qu?? tr??nh ph??n hu??? m?? ch??a ???????c mang ??i x??? l?? n?? sinh ra kh?? kh??ng t???t, ph???ng ph???t trong m??i tr?????ng v?? t??nh ???nh h?????ng ?????n s???c kho??? con ng?????i,Tr???m H????ng Vi???t ?????i An cho ???? l?? t?? kh??
                    </blockquote>
                    <h1>V??ng Tr???m phong th???y v?? t??c d???ng c???a Tr???m H????ng</h1>
                    <p>V??ng tay Tr???m H????ng ???????c gia c??ng tr???c ti???p t??? Tr???m t??? nhi??n. B??nh th?????ng 1 chi???c v??ng c?? ch???t l?????ng t???t ph???i ???????c l??m n??n t??? Tr???m c?? ni??n ?????i tr??n 10 n??m t??? ???? m???i gia c??ng ra v??ng tay g??? Tr???m. V??ng Tr???m ???????c b???t ngu???n t??? Ph???t gi??o c?? t??n l?? S??? Ch??u, Ni???m Ch??u, Ph???t Ch??u, hay Tr??ng h???t, m?? ng?????i tu h??nh xem n?? l?? 1 ph??p c???, ph??p th?? ????? ni???m Ph???t. Nh???c ?????n phong th???y l?? nh???c ?????n nh???ng y???u t??? thu???c v??? t??? nhi??n, ch???u t??c ?????ng t??? ?????t, n?????c, gi??, l???a - c??c y???u t??? m?? con ng?????i kh??ng th??? n???m b???t hay hi???u r?? quy lu???t c???a n??.</p>
                    <h2>Nhang Tr???m</h2>
                    <p>H????ng Tr???m ???????c chi???t xu???t t??? nguy??n li???u Tr???m 100% thi??n nhi??n kh??ng ?????c h???i, n??n s???n ph???m c?? m??u n??u t??? nhi??n c???a g??? Tr???m k???t h???p v???i b???t n???p. H????ng Tr???m c?? h????ng th??m ?????c tr??ng c???a g???
Tr???m h???i t??? tinh hoa ?????t tr???i qua h??ng ch???c n??m, mang ngu???n n??ng l?????ng t????i m???i ?????n cho ng?????i s??? d???ng.</p>
                   
                  </article>
                  <!-- blog navigation -->
                  <div class="aa-blog-navigation">
                    <a class="aa-blog-prev" href="blog-single3.jsp"><span class="fa fa-arrow-left"></span>Prev Post</a>
                    <a class="aa-blog-next" href="blog-single2.jsp">Next Post<span class="fa fa-arrow-right"></span></a>
                  </div>
                  <!-- blog comments form -->
                  <div id="respond">
                    <h3 class="reply-title">Leave a Comment</h3>
                    <form id="commentform">
                      <p class="comment-notes">
                        Your email address will not be published. Required fields are marked <span class="required">*</span>
                      </p>
                      <p class="comment-form-author">
                        <label for="author">Name <span class="required">*</span></label>
                        <input type="text" name="author" value="" size="30" required="required">
                      </p>
                      <p class="comment-form-email">
                        <label for="email">Email <span class="required">*</span></label>
                        <input type="email" name="email" value="" aria-required="true" required="required">
                      </p>
                      <p class="comment-form-url">
                        <label for="url">Website</label>
                        <input type="url" name="url" value="">
                      </p>
                      <p class="comment-form-comment">
                        <label for="comment">Comment</label>
                        <textarea name="comment" cols="45" rows="8" aria-required="true" required="required"></textarea>
                      </p>
                      <p class="form-submit">
                        <input type="submit" name="submit" class="aa-browse-btn" value="Post Comment">
                      </p>        
                    </form>
                  </div>
                </div>
              </div>

              <!-- blog sidebar -->
              <div class="col-md-3">
                <aside class="aa-blog-sidebar">
                  <div class="aa-sidebar-widget">
                    <h3>Tags</h3>
                    <div class="tag-cloud">
                      <a href="blog-archive-2.jsp">Tr???m h????ng</a>
                      <a href="blog-archive-2.jsp">Ph??n lo???i</a>
                    </div>
                  </div>
                </aside>
              </div>
            </div>           
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- / Blog Archive -->

<!-- footer -->  
  <footer id="aa-footer">
    <!-- footer bottom -->
    <div class="aa-footer-top">
     <div class="container">
        <div class="row">
        <div class="col-md-12">
          <div class="aa-footer-top-area">
            <div class="row">
              <div class="col-md-3 col-sm-6">
                <div class="aa-footer-widget">
                  <h3>Main Menu</h3>
                  <ul class="aa-footer-nav">
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="blog-archive-2.jsp">Blog</a></li>
                    <li><a href="contact.jsp">Contact Us</a></li>
                  </ul>
                </div>
              </div>
              <div class="col-md-6 col-sm-6">
                <div class="aa-footer-widget">
                  <div class="aa-footer-widget">
                    <h3>       </h3>
                  </div>
                </div>
              </div>
              <div class="col-md-3 col-sm-6">
                <div class="aa-footer-widget">
                  <div class="aa-footer-widget">
                    <h3>Contact Us</h3>
                    <address>
                      <p> 88 V??n Cao, TP Nam ?????nh</p>
                      <p><span class="fa fa-phone"></span>0915301665 - 0915300970 - 0942560232</p>
                      <p><span class="fa fa-envelope"></span>dai2452001@gmail.com</p>
                    </address>
                    <div class="aa-footer-social">
                      <a href="#"><span class="fa fa-facebook"></span></a>
                      <a href="#"><span class="fa fa-google-plus"></span></a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
     </div>
    </div>
  <!-- / footer --> 

  <!-- jQuery library -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="js/bootstrap.js"></script>  
  <!-- SmartMenus jQuery plugin -->
  <script type="text/javascript" src="js/jquery.smartmenus.js"></script>
  <!-- SmartMenus jQuery Bootstrap Addon -->
  <script type="text/javascript" src="js/jquery.smartmenus.bootstrap.js"></script>  
  <!-- To Slider JS -->
  <script src="js/sequence.js"></script>
  <script src="js/sequence-theme.modern-slide-in.js"></script>  
  <!-- Product view slider -->
  <script type="text/javascript" src="js/jquery.simpleGallery.js"></script>
  <script type="text/javascript" src="js/jquery.simpleLens.js"></script>
  <!-- slick slider -->
  <script type="text/javascript" src="js/slick.js"></script>
  <!-- Price picker slider -->
  <script type="text/javascript" src="js/nouislider.js"></script>
  <!-- Custom js -->
  <script src="js/custom.js"></script> 

  </body>
</html>
