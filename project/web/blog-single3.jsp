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
                  <li><a href="account.jsp">Đăng ký</a></li>
                  <c:if test="${sessionScope.acc !=null}">
                  <li><a href="logout">Đăng xuất</a></li>
                  </c:if>
                  <c:if test="${sessionScope.acc ==null}">
                   <li><a href="account.jsp">Đăng nhập</a></li>
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
                <li><a href="blog-archive-2.jsp">Hương nén TM</a></li>
                <li><a href="blog-archive-2.jsp">Hương nén trầm</a></li>
                <li><a href="blog-archive-2.jsp">Trầm nụ</a></li>
                <li><a href="blog-archive-2.jsp">Trà trầm</a></li>
                <li><a href="blog-archive-2.jsp">Trầm thiền</a></li>
                
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
                    <h2><a href="#">Trầm hương đối với sức khoẻ con người</a></h2>
                     <div class="aa-article-bottom">
                      <div class="aa-post-author">
                        Posted By <a href="#">Nguyen Kien Cuong</a>
                      </div>
                      <div class="aa-post-date">
                        May 24, 2019
                      </div>
                    </div>
                    <figure class="aa-blog-img">
                    </figure><h1>Công Dụng Của Trầm Hương trong Đông Y</h1></p>
                    <p>Lương y sư cô Nguyệt Liên chủ trì Tịnh Xá Tam Qui, đệ tử của Ngài hoà thượng Thích Giác Nhi ở đảo Phú Quốc, qua kinh nghiệm điều trị của sư cô Nguyệt Liên, Trầm Hương có tác dụng an thần, chống co thắt động mạch vành, phòng bệnh ung thư tuyến giáp, tăng cường chức năng gan, thận, tim ,bồi bổ cơ thể, điều chỉnh sức khoẻ cơ thể. Khi đeo vòng Trầm Hương hoặc để dưới gối khi ngủ, xông Trầm ( đốt Trầm ) hoặc uống đều có tác dụng tốt cho cơ thể. Trong các dược liệu quí hiếm như xạ hương, mật gấu... liên quan đến động thực vật thì Trầm hương tốt hơn cả, theo sư cô Nguyệt Liên trong An Cung Ngưu Hoàng chữa đột quỵ có Trầm hương trong đó.</p>
                    <p>Nhà thuốc Đông Nam Dược Lương y đa khoa Vũ Hồng Quân đ/c 231 Hoàng Văn Thụ -Tp Nam Định , Trầm Hương chữa những bệnh khí nghịch, đầy bụng, co quắp và bổ dưỡng cơ thể...</p>
                    <p>Trong quá trình sản xuất kinh doanh Trầm Hương Việt Đại An đã sử dụng chính sản phẩm của mình, Trầm Hương khi xông ( đốt ) có tác dụng xua đuổi tà khí trong nhà, phòng và chống tà khí bên ngoài vào nhà khi xông Trầm mỗi ngày, đón nhận vượng khí vào nhà tốt cho sức khoẻ gia đình ngoài ra còn chữa bệnh như viêm xoang các bệnh về đường hô hấp....</p>
                    <p>Tác dụng khi uống trà Trầm (chè Thái Nguyên truyền thống ướp Trầm) có tác dụng chữa đau dạ dày, đại tràng, ổn định đường ruột... </p>
                    <a href="#"><img src="img/fashion/image4.jpg" alt="fashion img"></a>
                    <h1>Công dụng của Trầm Hương Trong Tây Y</h1>
                    <p>Nhiều bác sỹ trong nền y học hiện đại khuyên bệnh nhân của mình nên để Trầm Hương ở dưới gối để giảm chứng đau đầu, chống lại các bệnh trầm cảm…. Bác sỹ cũng khuyên nên sử dụng Trầm uống cùng trà để thanh lọc cơ thể chữa một số bệnh như đau dạ dày, bảo vệ đường ruột,viêm loét đại tràng, phòng chống ung thư tuyến giáp và cải thiện sức khỏe của bản thân.</p>
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
                      <a href="blog-archive-2.jsp">Trầm hương</a>
                      <a href="blog-archive-2.jsp">Phân loại</a>
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
                      <p> 88 Văn Cao, TP Nam Định</p>
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