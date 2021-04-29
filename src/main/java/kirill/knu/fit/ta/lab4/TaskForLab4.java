/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirill.knu.fit.ta.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author savch
 */
public class TaskForLab4 {

    public String text;
    Matcher mat;
    
    public TaskForLab4(){
    
        text = "The idea of adding sensors and intelligence to basic objects was discussed throughout the 1980s and 1990s (and there are arguably some much earlier ancestors), but apart from some early projects -- including an internet-connected vending machine -- progress was slow simply because the technology wasn't ready. Chips were too big and bulky and there was no way for objects to communicate effectively. \n" +
        "\n" +
        "Processors that were cheap and power-frugal enough to be all but disposable were needed before it finally became cost-effective to connect up billions of devices. The adoption of RFID tags -- low-power chips that can communicate wirelessly -- solved some of this issue, along with the increasing availability of broadband internet and cellular and wireless networking. The adoption of IPv6 -- which, among other things, should provide enough IP addresses for every device the world (or indeed this galaxy) is ever likely to need -- was also a necessary step for the IoT to scale. \n" +
        "\n" +
        "Kevin Ashton coined the phrase 'Internet of Things' in 1999, although it took at least another decade for the technology to catch up with the vision. \n" +
        "\n" +
        "\"The IoT integrates the interconnectedness of human culture -- our 'things' -- with the interconnectedness of our digital information system -- 'the internet.' That's the IoT,\" Ashton told ZDNet. \n" +
        "\n" +
        "Adding RFID tags to expensive pieces of equipment to help track their location was one of the first IoT applications. But since then, the cost of adding sensors and an internet connection to objects has continued to fall, and experts predict that this basic functionality could one day cost as little as 10 cents, making it possible to connect nearly everything to the internet. \n" +
        "\n" +
        "The IoT was initially most interesting to business and manufacturing, where its application is sometimes known as machine-to-machine (M2M), but the emphasis is now on filling our homes and offices with smart devices, transforming it into something that's relevant to almost everyone. Early suggestions for internet-connected devices included 'blogjects' (objects that blog and record data about themselves to the internet), ubiquitous computing (or 'ubicomp'), invisible computing, and pervasive computing. However, it was Internet of Things and IoT that stuck.";

        text = cleanString(text);
    }
    
    private String cleanString(String input){
        input = input.toLowerCase();
        input = input.replaceAll("-{2,}","");
        input = input.replaceAll(" {2,}"," ");
        input = input.replaceAll("[^\\w -]", "").trim();       
    return input;
    } 

    public List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }

    public Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }

    public String Task4(List<String> result, int n, int b){
    
        List<String> answerList = new ArrayList<String>();
        int[] numberOfWords = new int[result.size()];
        
        for (int j = 0; j < result.size(); j++){
        
            String pattern = "";
            if (b == 1)
                pattern = "\\b" + result.get(j).replace("-", "\\-")  + "+\\b";
            else 
                pattern = result.get(j).replace("-", "\\-")  + "+";
            
            List<String> answerLine = new ArrayList<String>();
            mat = Pattern.compile(pattern).matcher(text);
        
            while (mat.find()){
                answerLine.add(text.substring(mat.start(), mat.end()));
            }
            
            numberOfWords[j] = answerLine.size();
            answerList.add(result.get(j));
            //System.out.println(numberOfWords[j] + " " + answerList.get(j));
        }
        
        String res = "";
        int i = 1;
        
        while (i <= n) {
        
            int max = 0;
            int maxid = 0;
        
            for (int j = 0; j < result.size(); j++){
            
                if (max <= numberOfWords[j]){
                
                    maxid = j;
                    max = numberOfWords[j];
                    //System.out.println(numberOfWords[j] + " " + answerList.get(j));
                    numberOfWords[j] = 0;
                }
            }
            res += i + ": " + answerList.get(maxid) + " = " + max + " | ";
            i++;
        }
        
        return res;  
    }
    
    public String Task5(String line, String l) {
    
        line = line.replaceAll("-", "");
        //List<String> answerLine = getList(line);
        List<String> answerLine = new ArrayList<String>();
        String pattern = l;
        
        mat = Pattern.compile("[a-z]*" + l + "[a-z]*").matcher(line);
        
        while (mat.find()){
            answerLine.add(line.substring(mat.start(), mat.end()));
        }
        
        return "" + (getList(line).size() - answerLine.size());
    }
    
    public String Task6(String line, int n){
    
        line = line.replaceAll("-", "");
        List<String> result = getList(line);
        int answerLine = 0;
        
        for (int j = 0; j < result.size(); j++){
            
            String letters = result.get(j);
            Set<String> resLetters = new HashSet<>();
            
            for (int i = 0; i < letters.length(); i++){
                
                resLetters.add("" + letters.charAt(i));
            }
            if (resLetters.size() == n)
                answerLine++;
            //System.out.println(resLetters.size() + " " + letters + " " + resLetters);
        }
        return "" + answerLine;
    }
    
    public String Task7(List<String> result, int n){
    
        List<String> resLetters = new ArrayList<String>();
        
        for (int j = 0; j < result.size(); j++){
            
            String letters = result.get(j);
            
            for (int i = 1; i < (letters.length() - 1); i++){
                
                resLetters.add("" + letters.charAt(i - 1) + letters.charAt(i) + letters.charAt(i + 1));
                //System.out.println("" + letters.charAt(i - 1) + letters.charAt(i) + letters.charAt(i + 1));
            }
        }
        
        return Task4(resLetters, n, 0);
    }
}
