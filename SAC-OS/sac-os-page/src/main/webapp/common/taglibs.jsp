<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib uri="http://www.springmodules.org/tags/commons-validator" prefix="v" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>

<%@ page import="net.easipay.cbp.cas.users.SecurityOperator"%>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder"%>
<% 
  SecurityOperator operator = (SecurityOperator)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  String loginNameCh = operator.getLoginNameCh();
 %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="loginNameCh" value="<%=loginNameCh%>"/>
<c:set var="datePattern"><fmt:message key="date.format"/></c:set>