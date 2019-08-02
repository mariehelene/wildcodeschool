<%@ page import="java.util.ArrayList" %>
<%@ page import="fr.wildcodeschool.githubtracker.model.Githuber" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <ul class="list-group">

        <c:forEach items="${githubersParm}" var="element">


            <li class="list-group-item">
                <div class="row">
                    <div class="col"><img src="${element.avatarUrl}" width="100" class="img-responsive"/></div>

                    <div class="col">
                        id: ${element.id}<br>
                        name: ${element.name}<br>
                        login: ${element.login}<br>
                        email: ${element.email}<br>
                    </div>
                </div>
            </li>


        </c:forEach>
    </ul>

    </div>

</body>
</html>
