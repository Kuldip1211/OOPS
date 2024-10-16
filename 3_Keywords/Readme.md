<font color="yellow" size="6" face="Arial">
<h1 bgcolor="yellow">📝Java Static Keyword</h1>
</font>

<p>The <strong>static</strong> keyword in Java is used for memory management mainly. We can apply the static keyword with variables, methods, blocks, and nested classes. The static keyword belongs to the class rather than an instance of the class.</p>

<h2>The static can be:</h2>
<ol>
    <li>Variable (also known as a class variable)</li>
    <li>Method (also known as a class method)</li>
    <li>Block</li>
    <li>Nested class</li>
</ol>

<h2>1) Java Static Variable</h2>
<p>If you declare any variable as static, it is known as a static variable.</p>
<ul>
    <li>The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.</li>
    <li>The static variable gets memory only once in the class area at the time of class loading.</li>
</ul>

<h3>Advantages of Static Variable</h3>
<p>It makes your program memory efficient (i.e., it saves memory).</p>

<h3>Understanding the Problem Without Static Variable</h3>
<pre><code>class Student {  
    int rollno;  
    String name;  
    String college = "ITS";  
}  
</code></pre>
<p>Suppose there are 500 students in my college; now all instance data members will get memory each time an object is created. All students have their unique rollno and name, so instance data members are good in such cases. Here, "college" refers to the common property of all objects. If we make it static, this field will get the memory only once.</p>

<h2>2) Java Static Method</h2>
<p>If you apply the static keyword with any method, it is known as a static method.</p>
<ul>
    <li>A static method belongs to the class rather than the object of a class.</li>
    <li>A static method can be invoked without the need for creating an instance of a class.</li>
    <li>A static method can access static data members and can change their values.</li>
</ul>

<h3>Restrictions for the Static Method</h3>
<ul>
    <li>The static method cannot use non-static data members or call non-static methods directly.</li>
    <li><code>this</code> and <code>super</code> cannot be used in a static context.</li>
</ul>

<h3>Q) Why is the Java main method static?</h3>
<p>Ans) It is because the object is not required to call a static method. If it were a non-static method, the JVM would create an object first and then call the <code>main()</code> method, leading to the problem of extra memory allocation.</p>

<h2>3) Java Static Block</h2>
<ul>
    <li>Is used to initialize the static data member.</li>
    <li>It is executed before the main method at the time of class loading.</li>
</ul>

<h3>Q) Can we execute a program without the main() method?</h3>
<p>Ans) No, one of the ways was the static block, but it was possible until JDK 1.6. Since JDK 1.7, it is not possible to execute a Java class without the main method.</p>

