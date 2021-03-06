<%-- 
    Document   : blog-single3
    Created on : Mar 21, 2022, 2:16:04 AM
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
                    <h2><a href="#">Tr???m h????ng ?????i v???i s???c kho??? con ng?????i</a></h2>
                     <div class="aa-article-bottom">
                      <div class="aa-post-author">
                        Posted By <a href="#">Nguyen Kien Cuong</a>
                      </div>
                      <div class="aa-post-date">
                        May 24, 2019
                      </div>
                    </div>
                    <figure class="aa-blog-img">
                    </figure><h1>C??ng D???ng C???a Tr???m H????ng trong ????ng Y</h1></p>
                    <p>L????ng y s?? c?? Nguy???t Li??n ch??? tr?? T???nh X?? Tam Qui, ????? t??? c???a Ng??i ho?? th?????ng Th??ch Gi??c Nhi ??? ?????o Ph?? Qu???c, qua kinh nghi???m ??i???u tr??? c???a s?? c?? Nguy???t Li??n, Tr???m H????ng c?? t??c d???ng an th???n, ch???ng co th???t ?????ng m???ch v??nh, ph??ng b???nh ung th?? tuy???n gi??p, t??ng c?????ng ch???c n??ng gan, th???n, tim ,b???i b??? c?? th???, ??i???u ch???nh s???c kho??? c?? th???. Khi ??eo v??ng Tr???m H????ng ho???c ????? d?????i g???i khi ng???, x??ng Tr???m ( ?????t Tr???m ) ho???c u???ng ?????u c?? t??c d???ng t???t cho c?? th???. Trong c??c d?????c li???u qu?? hi???m nh?? x??? h????ng, m???t g???u... li??n quan ?????n ?????ng th???c v???t th?? Tr???m h????ng t???t h??n c???, theo s?? c?? Nguy???t Li??n trong An Cung Ng??u Ho??ng ch???a ?????t qu??? c?? Tr???m h????ng trong ????.</p>
                    <p>Nh?? thu???c ????ng Nam D?????c L????ng y ??a khoa V?? H???ng Qu??n ??/c 231 Ho??ng V??n Th??? -Tp Nam ?????nh , Tr???m H????ng ch???a nh???ng b???nh kh?? ngh???ch, ?????y b???ng, co qu???p v?? b??? d?????ng c?? th???...</p>
                    <p>Trong qu?? tr??nh s???n xu???t kinh doanh Tr???m H????ng Vi???t ?????i An ???? s??? d???ng ch??nh s???n ph???m c???a m??nh, Tr???m H????ng khi x??ng ( ?????t ) c?? t??c d???ng xua ??u???i t?? kh?? trong nh??, ph??ng v?? ch???ng t?? kh?? b??n ngo??i v??o nh?? khi x??ng Tr???m m???i ng??y, ????n nh???n v?????ng kh?? v??o nh?? t???t cho s???c kho??? gia ????nh ngo??i ra c??n ch???a b???nh nh?? vi??m xoang c??c b???nh v??? ???????ng h?? h???p....</p>
                    <p>T??c d???ng khi u???ng tr?? Tr???m (ch?? Th??i Nguy??n truy???n th???ng ?????p Tr???m) c?? t??c d???ng ch???a ??au d??? d??y, ?????i tr??ng, ???n ?????nh ???????ng ru???t... </p>
                    <a href="#"><img src="img/fashion/image4.jpg" alt="fashion img"></a>
                    <h1>C??ng d???ng c???a Tr???m H????ng Trong T??y Y</h1>
                    <p>Nhi???u b??c s??? trong n???n y h???c hi???n ?????i khuy??n b???nh nh??n c???a m??nh n??n ????? Tr???m H????ng ??? d?????i g???i ????? gi???m ch???ng ??au ?????u, ch???ng l???i c??c b???nh tr???m c???m???. B??c s??? c??ng khuy??n n??n s??? d???ng Tr???m u???ng c??ng tr?? ????? thanh l???c c?? th??? ch???a m???t s??? b???nh nh?? ??au d??? d??y, b???o v??? ???????ng ru???t,vi??m lo??t ?????i tr??ng, ph??ng ch???ng ung th?? tuy???n gi??p v?? c???i thi???n s???c kh???e c???a b???n th??n.</p>
                  </article>
                  <!-- blog navigation -->
                  <div class="aa-blog-navigation">
                    <a class="aa-blog-prev" href="blog-single2.jsp"><span class="fa fa-arrow-left"></span>Prev Post</a>
                    <a class="aa-blog-next" href="blog-single.jsp">Next Post<span class="fa fa-arrow-right"></span></a>
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