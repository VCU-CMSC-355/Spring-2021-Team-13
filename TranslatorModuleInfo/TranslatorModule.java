/****************************************************
 * Module Name : TranslatorModule
 *
 * Component : Task Layer
 *
 * Description of Module :
 *
 *
 ****************************************************
 * Input : Language, word
 * Output : Translated word
 *
 ****************************************************
 * LOG
 *
 * 4/24/2021 : Created by Jacob Picardat
 *
 *
 *
 */


import java.io.*;
import java.util.ArrayList;

public class TranslatorModule
{
    // variables
    static String myPath = "";
    static String line;
    static String[] strArr;


    static String ReturnData = "";
    static int ReturnCode = 0;

    public static void main(String[] args)
    {
        boolean foundLang;
        boolean foundWord;
        String language;
        String word;

        // Reads in command line arguments
        ArrayList<String> argsList = new ArrayList<>();
        for(int i = 0; i<args.length; i++)
        {
            argsList.add(args[i]);
        }

        // Makes sure there are at least 2 arguments passed
        try
        {
            language = argsList.get(0);
            word = argsList.get(1);

            // Makes sure buffered reader can find the files it needs
            try {
                foundLang = searchTransFile(language);
                if (foundLang) {
                    foundWord = searchLangFile(word);
                    if (!foundWord) {
                        // messageCaller(813);

                        // THIS IS DUMMY CODE
                        ReturnData = "Word Not Found";
                        ReturnCode = 4;
                    }
                }
                else
                {
                    // messageCaller(805);

                    // THIS IS DUMMY CODE
                    ReturnData = "Language Not Found";
                    ReturnCode = 4;
                }

            }
            catch (IOException e)
            {
                //e.printStackTrace();
            }
        }
        catch(Exception e)
        {
            // messageCaller(404);
            ReturnCode = 4;
            ReturnData = "Not Found";
        }

        // Print out data
        System.out.print(ReturnCode + " " + ReturnData);
    }

    static boolean searchTransFile(String language) throws IOException
    {
        // Creates buffered reader for translate.txt
        InputStream transIS = TranslatorModule.class.getResourceAsStream("translate.txt");
        BufferedReader transFileReader = new BufferedReader(new InputStreamReader(transIS));
        boolean flag = false;
        // Goes through translate.txt until it finds the language specified by the command line arguments
        while((line = transFileReader.readLine())!=null && !flag)
        {
            strArr = line.split(",");
            if(strArr[0].equals(language))
            {
                // Sets the path to that of the file with the translated words
                myPath = strArr[1];
                flag = true;
            }
        }
        transIS.close();
        transFileReader.close();
        return flag;
    }

    static boolean searchLangFile(String word) throws IOException
    {
        // Creates buffered reader for myPath
        InputStream langIS = TranslatorModule.class.getResourceAsStream(myPath);
        BufferedReader langFileReader = new BufferedReader(new InputStreamReader(langIS));

        boolean flag = false;
        // Goes through text file at myPath until it finds the word specified by the command line arguments
        while ((line = langFileReader.readLine()) != null && !flag)
        {
            strArr = line.split(",");
            if (strArr[0].equals(word))
            {
                // Copies found word into trans
                ReturnData = strArr[1];
                flag = true;
            }
        }
        langIS.close();
        langFileReader.close();
        return flag;
    }

    static String messageCaller(int msg)
    {
        // Call Utility Module Message with code msg
        // Place returned data into ReturnData
        // ReturnCode = 4;
        return "";
    }

}
