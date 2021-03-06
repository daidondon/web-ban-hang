<%-- 
    Document   : blog-single2
    Created on : Mar 21, 2022, 2:15:24 AM
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
                    <h2><a href="#">Ph??n lo???i tr???m h????ng</a></h2>
                     <div class="aa-article-bottom">
                      <div class="aa-post-author">
                        Posted By <a href="#">Nguyen Kien Cuong</a>
                      </div>
                      <div class="aa-post-date">
                        June 21, 2017
                      </div>
                    </div>
                    <figure class="aa-blog-img">
                    <h1>Tr???m K??? Nam</h1>
                    <p>K??? nam l?? lo???i Tr???m H????ng ?????c bi???t qu?? hi???m, gi?? Tr???m h????ng K??? nam l??n ?????n h??ng t??? ?????ng, cao nh???t trong c??c lo???i Tr???m v?? ?????c t??nh kh?? khai th??c. Tr???m K??? nam c?? l?????ng d???u l???n nh???t trong c??c lo???i Tr???m, m???m v?? d???o, m??i h????ng ?????y ????? v??? cay,?????ng, th??m, ng???t, kh??i xanh bay th???ng l??n cao.
Tr???m K??? nam ???????c ph??n th??nh 4 lo???i:</p>
                    <p>+B???ch K???: S???c tr???ng ng?? , x??m nh???t c?? gi?? tr??? cao nh???t</p>
                    <p>+Thanh K???: M??u xanh x??m ??nh l???c</p>
                    <p>+Hu???nh K???: m??u v??ng s???m, v??ng n??u</p>
                    <p>+H???c K???: c?? m??u ??en</p>
                    <p>Ng?????i x??a x???p lo???i K??? Nam (nh???t B???ch K???, nh?? Thanh, tam Hu???nh, t??? H???c)</p>
                    <a href="#"><img src="img/fashion/image2.png" alt="fashion img"></a>
                    <h1>Tr???m ch??m</h1>
                    <p>Tr???m ch??m l?? lo???i Tr???m t??? d???u l??u n??m, t??? d???u Tr???m ?????c 100% tinh d???u, th??? xu???ng n?????c n?? ch??m kh??ng n???i tr??n m???t n?????c, lo???i n??y ?????ng sau K??? Nam , c?? m??u s??m ??en , lo???i n??y hi???n nay c??ng r???t hi???m, ????? c?? m???t v??ng Tr???m ch??m 14-15 ly c??ng c?? gi?? l??n t???i ti???n t???, th?????ng th?? hi???n nay tr??n th??? tr?????ng c??ng ch??? c?? nh???ng c???c nh??? to b???ng ng??n tay c??i ng?????i l???n ho???c nh??? b???ng ng??n tay c??i tr??? s?? sinh, ng?????i c?? n?? th?????ng l??m m???t d??y truy???n ????? ??eo, ho???c ????? d?????i g???i ... c?? m??i th??m nh?? K??? Nam, n???u ?????t n?? cho m??i th??m ng???t s??u r???t kh?? t??? v?? ch??? ?????t s??i d???u, ??eo Tr???m tr??n ng?????i n?? th??? hi???n s??? qu?? ph??i sang tr???ng cho ng?????i ??eo n??, r???t t???t v??? c??? m???t s???c kho??? v?? t??m linh.</p>
                    <h1>Tr???m r???</h1>
                    <p>Lo???i Tr???m n??y r???t qu?? hi???m , hi h???u m???i c?? n?? g???n gi???ng K??? Nam v?? Tr???m ch??m nh??ng kh??ng ???????c ho??n h???o nh?? K??? Nam, r??? c??y b??? th????ng d?????i n?????c v?? h??nh th??nh Tr???m r??? , v???i ?????c t??nh kh?? khai th??c v?? gi?? tr??? kinh t??? cao , Tr???m r??? ???????c mua b??n qua tay nhanh ch??ng v?? kh??ng b??y b??n tr??n th??? tr?????ng , nhi???u ng?????i hay b??? nh???m Tr???m r??? v???i Tr???m ch??m.</p>
                    <h1>Tr???m ki???n</h1>
                    <p>L?? lo???i tr???m c?? l???, hang do ki???n ho???c s??u tr???m ?????c l??m t??? tr??n c??y. M???c gi?? Tr???m H????ng ki???n dao ?????ng t??? v??i tri???u ?????n tr??m tri???u tr??? l??n (ph??? thu???c v??o tinh d???u tr???m nhi??u hay ??t), l?? m???t lo???i Tr???m kh?? qu?? hi???m trong t??? nhi??n. </p>
                    <a href="#"><img src="img/fashion/image3.jpg" alt="fashion img"></a>
                    <h1>Tr???m n???u</h1>
                    <p>Tr???m n???u: L?? lo???i Tr???m ??t d???u nh???t khi t???o h???t hay t???c t?????ng v?? c??c s???n ph???m kh??c ..ng?????i l??m Tr???m chi???t xu???t t??? nh???ng c??y ??t Tr???m cho ra tinh d???u Tr???m sau ???? b??? c??c s???n ph???m Tr???m v??o n???u cho tinh d???u th???m th???u v??o s???n ph???m, lo???i Tr???m n???u n??y c?? m??i th??m m???nh h??n Tr???m t??? nhi??n v??? gi?? tr??? kinh t??? kh??ng cao nh??ng h???p th???i trang nhi???u h??n.</p>
                  </article>
                    
                  <!-- blog navigation -->
                  <div class="aa-blog-navigation">
                    <a class="aa-blog-prev" href="blog-single.jsp"><span class="fa fa-arrow-left"></span>Prev Post</a>
                    <a class="aa-blog-next" href="blog-single3.jsp">Next Post<span class="fa fa-arrow-right"></span></a>
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
