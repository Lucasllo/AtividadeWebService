<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCalculadoraProxyid" scope="session" class="br.com.calculadora.CalculadoraProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCalculadoraProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCalculadoraProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCalculadoraProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        br.com.calculadora.Calculadora getCalculadora10mtemp = sampleCalculadoraProxyid.getCalculadora();
if(getCalculadora10mtemp == null){
%>
<%=getCalculadora10mtemp %>
<%
}else{
        if(getCalculadora10mtemp!= null){
        String tempreturnp11 = getCalculadora10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String num1_1id=  request.getParameter("num116");
        int num1_1idTemp  = Integer.parseInt(num1_1id);
        String num2_2id=  request.getParameter("num218");
        int num2_2idTemp  = Integer.parseInt(num2_2id);
        int soma13mtemp = sampleCalculadoraProxyid.soma(num1_1idTemp,num2_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(soma13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String num1_3id=  request.getParameter("num123");
        int num1_3idTemp  = Integer.parseInt(num1_3id);
        String num2_4id=  request.getParameter("num225");
        int num2_4idTemp  = Integer.parseInt(num2_4id);
        int divisao20mtemp = sampleCalculadoraProxyid.divisao(num1_3idTemp,num2_4idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(divisao20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
case 27:
        gotMethod = true;
        String num1_5id=  request.getParameter("num130");
        int num1_5idTemp  = Integer.parseInt(num1_5id);
        String num2_6id=  request.getParameter("num232");
        int num2_6idTemp  = Integer.parseInt(num2_6id);
        int multiplicacao27mtemp = sampleCalculadoraProxyid.multiplicacao(num1_5idTemp,num2_6idTemp);
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(multiplicacao27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
break;
case 34:
        gotMethod = true;
        String num1_7id=  request.getParameter("num137");
        int num1_7idTemp  = Integer.parseInt(num1_7id);
        String num2_8id=  request.getParameter("num239");
        int num2_8idTemp  = Integer.parseInt(num2_8id);
        int subtracao34mtemp = sampleCalculadoraProxyid.subtracao(num1_7idTemp,num2_8idTemp);
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(subtracao34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>