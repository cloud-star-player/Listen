/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-05 11:31:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.X_002dadmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class author_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>欢迎页面-X-admin2.0</title>\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi\" />\n");
      out.write("    ");

        String path=request.getContextPath();
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
      out.write("\n");
      out.write("    <base href=\" ");
      out.print(basePath);
      out.write("\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/font.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/xadmin.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/lib/layui/layui.js\" charset=\"utf-8\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/xadmin.js\"></script>\n");
      out.write("    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"https://cdn.staticfile.org/html5shiv/r29/html5.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"x-body\">\n");
      out.write("    <form class=\"layui-form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Authorupload\" enctype=\"multipart/form-data\" method=\"post\">\n");
      out.write("        <div class=\"layui-form-item\">\n");
      out.write("            <label for=\"author_name\" class=\"layui-form-label\">\n");
      out.write("                <span class=\"x-red\">*</span>歌手名称\n");
      out.write("            </label>\n");
      out.write("            <div class=\"layui-input-inline\">\n");
      out.write("                <input type=\"text\" id=\"author_name\" name=\"author_name\"  required=\"\" lay-verify=\"required\"\n");
      out.write("                       autocomplete=\"off\" class=\"layui-input\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"layui-form-item\">\n");
      out.write("            <label for=\"author_image\" class=\"layui-form-label\">\n");
      out.write("                <span class=\"x-red\">*</span>歌手图片\n");
      out.write("            </label>\n");
      out.write("            <div class=\"layui-input-inline\">\n");
      out.write("                <input type=\"file\" id=\"author_image\" name=\"author_image\"  required=\"\" lay-verify=\"required\"\n");
      out.write("                       autocomplete=\"off\" class=\"layui-input\">\n");
      out.write("                <img src=\"\" id=\"author_image2\" style=\"width: 20rem;height: 15rem;\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                        ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("        ");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"layui-form-item\">\n");
      out.write("    <label for=\"L_repass\" class=\"layui-form-label\">\n");
      out.write("    </label>\n");
      out.write("\n");
      out.write("    <button  class=\"layui-btn\" lay-filter=\"add\" lay-submit=\"\">\n");
      out.write("        增加\n");
      out.write("    </button>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    $(\"#author_image\").change(function(){\n");
      out.write("        var objUrl = getObjectURL(this.files[0]) ;//获取文件信息\n");
      out.write("        var author_image=document.getElementById(\"author_image\").value;\n");
      out.write("        if(!/.(gif|jpg|jpeg|png|GIF|JPG|bmp|PNG)$/.test(author_image)){\n");
      out.write("            alert(\"图片类型必须是.gif,jpeg,jpg,png,bmp中的一种\");\n");
      out.write("            var obj = document.getElementById('author_image') ;\n");
      out.write("        }\n");
      out.write("        console.log(\"objUrl = \"+objUrl);\n");
      out.write("        if (objUrl) {\n");
      out.write("            $(\"#author_image2\").attr(\"src\", objUrl);\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("    function getObjectURL(file) {\n");
      out.write("        var url = null;\n");
      out.write("        if (window.createObjectURL!=undefined) {\n");
      out.write("            url = window.createObjectURL(file) ;\n");
      out.write("        }\n");
      out.write("        else if (window.URL!=undefined) { // mozilla(firefox)\n");
      out.write("            url = window.URL.createObjectURL(file) ;\n");
      out.write("        } else if (window.webkitURL!=undefined) { // webkit or chrome\n");
      out.write("            url = window.webkitURL.createObjectURL(file) ;\n");
      out.write("        }\n");
      out.write("        return url ;\n");
      out.write("    }\n");
      out.write("    $('.layui-btn').click(function() {\n");
      out.write("        var author_image = document.getElementById(\"author_image\").value;\n");
      out.write("        if (author_image == \"\" || author_image.length == 0) {\n");
      out.write("            alert(\"请选择文件\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if (!/.(gif|jpg|jpeg|png|GIF|JPG|bmp|PNG)$/.test(author_image)) {\n");
      out.write("            alert(\"图片类型必须是.gif,jpeg,jpg,png,bmp中的一种\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("    ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    // layui.use(['form','layer'], function(){\n");
      out.write("    //     $ = layui.jquery;\n");
      out.write("    //     var form = layui.form\n");
      out.write("    //         ,layer = layui.layer;\n");
      out.write("    //\n");
      out.write("    //     //自定义验证规则\n");
      out.write("    //     form.verify({\n");
      out.write("    //         nikename: function(value){\n");
      out.write("    //             if(value.length < 5){\n");
      out.write("    //                 return '昵称至少得5个字符啊';\n");
      out.write("    //             }\n");
      out.write("    //         }\n");
      out.write("    //         ,pass: [/(.+){6,12}$/, '密码必须6到12位']\n");
      out.write("    //         ,repass: function(value){\n");
      out.write("    //             if($('#L_pass').val()!=$('#L_repass').val()){\n");
      out.write("    //                 return '两次密码不一致';\n");
      out.write("    //             }\n");
      out.write("    //         }\n");
      out.write("    //     });\n");
      out.write("    //\n");
      out.write("    //     //监听提交\n");
      out.write("    //     form.on('submit(add)', function(data){\n");
      out.write("    //         console.log(data);\n");
      out.write("    //         //发异步，把数据提交给php\n");
      out.write("    //         layer.alert(\"增加成功\", {icon: 6},function () {\n");
      out.write("    //             // 获得frame索引\n");
      out.write("    //             var index = parent.layer.getFrameIndex(window.name);\n");
      out.write("    //             //关闭当前frame\n");
      out.write("    //             parent.layer.close(index);\n");
      out.write("    //         });\n");
      out.write("    //         return false;\n");
      out.write("    //     });\n");
      out.write("    //\n");
      out.write("    // });\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    var _hmt = _hmt || []; (function() {\n");
      out.write("    var hm = document.createElement(\"script\");\n");
      out.write("    hm.src = \"https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190\";\n");
      out.write("    var s = document.getElementsByTagName(\"script\")[0];\n");
      out.write("    s.parentNode.insertBefore(hm, s);\n");
      out.write("})();</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
