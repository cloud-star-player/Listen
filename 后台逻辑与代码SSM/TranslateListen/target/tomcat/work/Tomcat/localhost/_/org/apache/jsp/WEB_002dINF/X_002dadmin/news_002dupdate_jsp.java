/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-05 06:02:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.X_002dadmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class news_002dupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>后台登录-X-admin2.0</title>\n");
      out.write("    <meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi\" />\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\n");
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
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"x-body\">\n");
      out.write("    <form class=\"layui-form\" id=\"layui-form\">\n");
      out.write("        <div class=\"layui-form-item\">\n");
      out.write("            <label for=\"news_id\" class=\"layui-form-label\">\n");
      out.write("                <span class=\"x-red\">*</span>消息修改\n");
      out.write("            </label>\n");
      out.write("            <div class=\"layui-input-inline\">\n");
      out.write("                <input type=\"hidden\" id=\"news_id\" name=\"news_id\" required=\"\" lay-verify=\"required\"\n");
      out.write("                       autocomplete=\"off\" class=\"layui-input\" value=\"\" >\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"layui-form-item\">\n");
      out.write("            <label for=\"news_title\" class=\"layui-form-label\">\n");
      out.write("                <span class=\"x-red\">*</span>消息标题\n");
      out.write("            </label>\n");
      out.write("            <div class=\"layui-input-inline\">\n");
      out.write("                <input type=\"text\" id=\"news_title\" name=\"news_title\"   required=\"\" lay-verify=\"required\"\n");
      out.write("                       autocomplete=\"off\" class=\"layui-input\" value=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"layui-form-item\">\n");
      out.write("            <label for=\"news_text\" class=\"layui-form-label\">\n");
      out.write("                <span class=\"x-red\">*</span>歌曲内容\n");
      out.write("            </label>\n");
      out.write("            <div class=\"layui-input-inline\">\n");
      out.write("                <input type=\"text\"  name=\"news_text\" id=\"news_text\" required=\"\" lay-verify=\"required\"\n");
      out.write("                       autocomplete=\"off\" class=\"layui-input\" value=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"layui-form-item\">\n");
      out.write("            <label for=\"news_author_id\" class=\"layui-form-label\">\n");
      out.write("                <span class=\"x-red\">*</span>音乐作者\n");
      out.write("            </label>\n");
      out.write("            <div class=\"layui-input-inline\">\n");
      out.write("                <select name=\"news_author_id\" id=\"news_author_id\">\n");
      out.write("                    <option value=\"\">音乐作者</option>\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"layui-form-item\">\n");
      out.write("            <label for=\"news_type\" class=\"layui-form-label\">\n");
      out.write("                <span class=\"x-red\">*</span>消息分类\n");
      out.write("            </label>\n");
      out.write("            <div class=\"layui-input-inline\" >\n");
      out.write("                <select name=\"news_type\" id=\"news_type\">\n");
      out.write("                    <option value=\"\">消息分类</option>\n");
      out.write("                    <option value=1>歌曲消息</option>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"layui-form-item\">\n");
      out.write("            <label for=\"L_news_title\" class=\"layui-form-label\">\n");
      out.write("            </label>\n");
      out.write("            <button  class=\"layui-btn\" lay-filter=\"save\" lay-submit=\"\">\n");
      out.write("                修改\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    $.ajax({\n");
      out.write("        type:\"get\",\n");
      out.write("        url:\"");
      out.print(basePath);
      out.write("newsselect2/\"+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.news_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\n");
      out.write("        dataType : \"json\",\n");
      out.write("        contentType : \"application/json;charset=UTF-8\",\n");
      out.write("        success:function(data) {\n");
      out.write("            $(\"#news_id\").val(data.news_id);\n");
      out.write("            $(\"#news_title\").val(data.news_title);\n");
      out.write("            $(\"#news_text\").val(data.news_text);\n");
      out.write("            $(\"#news_author_id\").val(data.news_author_id);\n");
      out.write("            $(\"#news_type\").val(data.news_type);\n");
      out.write("        }});\n");
      out.write("    $('.layui-btn').click(function() {\n");
      out.write("        $.post(\"");
      out.print(basePath);
      out.write("newsupdate\",\n");
      out.write("            $(\"#layui-form\").serialize(), function (data) {\n");
      out.write("                if (data == 1) {\n");
      out.write("                    alert(\"修改成功！\");\n");
      out.write("                    parent.location.reload();\n");
      out.write("                } else {\n");
      out.write("                    alert(\"修改失败！\");\n");
      out.write("                    parent.location.reload();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("    })\n");
      out.write("\n");
      out.write("\n");
      out.write("    layui.use(['form','layer'], function(){\n");
      out.write("        $ = layui.jquery;\n");
      out.write("        var form = layui.form\n");
      out.write("            ,layer = layui.layer;\n");
      out.write("\n");
      out.write("        //监听提交\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script>var _hmt = _hmt || []; (function() {\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/X-admin/news-update.jsp(63,20) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${authorid}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/X-admin/news-update.jsp(63,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.author_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.author_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
