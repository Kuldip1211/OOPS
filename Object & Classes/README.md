<h1>Object in Java</h1>
<p>An entity that has state and behavior is known as an object. Examples include chair, bike, marker, pen, table, car, etc. An object can be physical or logical (tangible and intangible). An example of an intangible object is the banking system.</p>

<h2>Key Characteristics of an Object</h2>
<ol>
    <li>An object is a real-world entity.</li>
    <li>An object is a runtime entity.</li>
    <li>The object is an entity which has state and behavior.</li>
    <li>The object is an instance of a class.</li>
</ol>

<h1>What is a Class in Java?</h1>
<p>A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. A class is a logical entity and cannot be physical.</p>

<h2>A Class in Java Can Contain:</h2>
<ul>
    <li>Fields</li>
    <li>Methods</li>
    <li>Constructors</li>
    <li>Blocks</li>
    <li>Nested classes and interfaces</li>
</ul>

<div class="syntax">
    <h2>Syntax to Declare a Class:</h2>
    <code>class &lt;class_name&gt; {<br>
        &nbsp;&nbsp;field;<br>
        &nbsp;&nbsp;method;<br>
    }</code>
</div>

<h2>Instance Variable in Java</h2>
<p>A variable that is created inside the class but outside the method is known as an instance variable. Instance variables don't get memory at compile time; they get memory at runtime when an object or instance is created. That is why they are known as instance variables.</p>

<h2>The <code>new</code> Keyword in Java</h2>
<p>The <code>new</code> keyword is used to allocate memory at runtime. All objects receive memory in the heap memory area.</p>

<h2>3 Ways to Initialize an Object</h2>
<p>There are three ways to initialize an object in Java:</p>
<ol>
    <li>By reference variable</li>
    <li>By method</li>
    <li>By constructor</li>
</ol>

<h2>What are the Different Ways to Create an Object in Java?</h2>
<p>There are many ways to create an object in Java. They include:</p>
<ul>
    <li>By <code>new</code> keyword</li>
    <li>By <code>newInstance()</code> method</li>
    <li>By <code>clone()</code> method</li>
    <li>By deserialization</li>
    <li>By factory method</li>
</ul>

<h2>Anonymous Object</h2>
<p>An anonymous object is an object that has no reference. It can only be used at the time of object creation. If you have to use an object only once, an anonymous object is a good approach. For example:</p>
<div class="syntax">
    <code>new Calculation(); // anonymous object</code>
</div>
