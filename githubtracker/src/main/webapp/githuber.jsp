<%@ page import="java.util.ArrayList" %>
<%@ page import="fr.wildcodeschool.githubtracker.model.Githuber" %>
<%--@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" --%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: mhd
  Date: 20/07/19
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp" />
<%
    // on récupère le paramètre
    // ancienne méthode
    // ArrayList<Githuber> githubersList = (ArrayList<Githuber>) request.getAttribute("githubersParm");
%>

    <div class="container">

    <c:set var = "liste" value = "${githubersParm}"/>

    <ul class="list-group">

        <c:forEach items="${liste}" var="element"  varStatus="loop">


            <li class="list-group-item">
                <div class="row">
                    <div class="col"><img src="<c:out value="${element.avatarUrl}" />" width="100" class="img-responsive"/></div>

                    <div class="col">
                        <c:out value="id: ${element.id}"/><br>
                        <c:out value="name: ${element.name}"/><br>
                        <c:out value="login: ${element.login}"/><br>
                        <c:out value="email: ${element.email}"/><br>
                    </div>
                </div>
            </li>


        </c:forEach>
    </ul>

    </div>

</body>
</html>
