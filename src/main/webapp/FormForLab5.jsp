<%-- 
    Document   : FormForLab5
    Created on : Apr 30, 2021, 1:51:23 AM
    Author     : savch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 align="center">Complete the task with the lists</h2>
        
        <h4 align="center">The idea of adding sensors and intelligence to basic objects was discussed throughout the 1980s and 1990s (and there are arguably some much earlier ancestors), but apart from some early projects -- including an internet-connected vending machine -- progress was slow simply because the technology wasn't ready. Chips were too big and bulky and there was no way for objects to communicate effectively.

Processors that were cheap and power-frugal enough to be all but disposable were needed before it finally became cost-effective to connect up billions of devices. The adoption of RFID tags -- low-power chips that can communicate wirelessly -- solved some of this issue, along with the increasing availability of broadband internet and cellular and wireless networking. The adoption of IPv6 -- which, among other things, should provide enough IP addresses for every device the world (or indeed this galaxy) is ever likely to need -- was also a necessary step for the IoT to scale. 

Kevin Ashton coined the phrase 'Internet of Things' in 1999, although it took at least another decade for the technology to catch up with the vision.

"The IoT integrates the interconnectedness of human culture -- our 'things' -- with the interconnectedness of our digital information system -- 'the internet.' That's the IoT," Ashton told ZDNet.

Adding RFID tags to expensive pieces of equipment to help track their location was one of the first IoT applications. But since then, the cost of adding sensors and an internet connection to objects has continued to fall, and experts predict that this basic functionality could one day cost as little as 10 cents, making it possible to connect nearly everything to the internet.

The IoT was initially most interesting to business and manufacturing, where its application is sometimes known as machine-to-machine (M2M), but the emphasis is now on filling our homes and offices with smart devices, transforming it into something that's relevant to almost everyone. Early suggestions for internet-connected devices included 'blogjects' (objects that blog and record data about themselves to the internet), ubiquitous computing (or 'ubicomp'), invisible computing, and pervasive computing. However, it was Internet of Things and IoT that stuck.</h4>
        
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>

        
        <div>
            <form align="center" method="post" action="lab5">
                <h2 align="center">Please enter a search word</h2>
                <input type="text" name="t1find" placeholder="find"/>
                <h2 align="center">Enter the starting position of your search in the text (Do not enter if full text search)</h2>
                <input type="text" name="t1start" placeholder="start"/>
                <h2 align="center">Enter the end position of your search in the text (Do not enter if full text search)</h2>
                <input type="text" name="t1finish" placeholder="finish"/>
                <h2 align="center">Enter the length of the list</h2>
                <input type="text" name="t2" placeholder="length"/>
                <h2 align="center">Please enter a letter to search</h2>
                <input type="text" name="t3string" placeholder="letter"/>
                <h2 align="center">Enter the byte value to search</h2>
                <input type="text" name="t3byte" placeholder="byte"/>
                <p> <p>
                <input type="submit" value="ok"/>
            </form>
        </div>
    </body>
</html>
