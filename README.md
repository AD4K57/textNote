
<h1>TEXTNOTE <hr/></h1>
<h2>Necessity</h2>
<ul>
<li><h4>MYSQL</h4></li>
<p>Firstly, need to run mysql container with 3310 port</p><br>
<li><h4>TEXTNOTE</h4></li>
<p> clone project to local, and build Dockerfile for image with below command</p>
<pre><code>docker build -t [your_container_name] .
</code></pre><br>
<p>run textnote container</p>
<pre><code>docker run -d -p 5757:8080 [your_container_name]</code></pre><br>
<li>You can send request with Postman or other platforms to 5757 port</li>
<li>You can change textNote container port,
but if you change mysql port textNote doesn't run. If you want to change myqsl port, you must change in from project</li>
<li><p>If use test profile you not obliged run MYSQL container, can use h2 db when project run (soon)</p></li>
</ul>
