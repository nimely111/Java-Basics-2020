import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Quiz implements ActionListener{
       //My Array of String begins here. This Array of String holds the questions in it's container
    String[] questions = {
                                "Which Company created Java? ",
                                 "Which year was Java created? ",
                                "What was java originally called? ",
                                 "Who is credited for creating java? ",
                                 "Who is the CEO for Rhotel Innovation House",
                                  "if x = 3, & x < 9 what will be your output in loop?",
                                  "Which Computer College code for fun in Liberia? "
                                  
                                  
                           /*  "What is the first month of the year? ",
                             "What is the twelve month of the year? ",
                             "What is the fourth month of the year? ",
                             "What is the sixth month of the year? ",
                             "What is the eighth month of the year? ",
                            "What is the tenth month of the year? ",
                            "What is the ninth month of the year? ",
                            "What is the eleventh month of the year? ",
                            "What is the fifth month of the year? ",
                            "What is the seventh month of the year? ",
                           "What is the third month of the year? ",
                           "What is the second month of the year? "*/



                         };
    String[][] options = {
                          // this is our 2-Dimensional Array of String [][] which holds our options
                                  {"Sun Microsystems", "Starbucks", "Microsoft", "Rhotel"},
                                   {"1989", "1996", "1972", "1847"},
                                   {"Apple", "MTN", "Oak", "Orange"},
                                   {"Steve Jobs", "Bill Gates", "James Gosling", "Mark Zukerberg "},
                                   {"Lua Dave", "Prof. Davidson", "Sis. Betsy", "Nimely"},
                                   {"3,5,6,7,8", "8,7,6,5,4,3", "8,7,5,6,3,4", "3,4,5,6,7,8"},
                                   {"Starz University", "AMEU University", "Rhotel House", "Blue Crest"}
                                   
                               /*{"March", "May", "January", "Janury"},
                               {"December", "April", "Desember", "November"},
                              {"Aprl", "January", "April", "March"},
                             {"August", "June", "July", "September"},
                             {"March", "Augustin", "May", "August"},
                           {"October", "November", "Otopus", "September"},
                            {"Septmber", "May", "September", "Janury"},
                           {"Novembr", "October", "December", "November"},
                           {"May", "June", "July", "Maye"},
                           {"Jula", "July", "October", "May"},
                          {"March", "February", "May", "Mach"},
                         {"Febrary", "September", "August", "February"} */

    };
    char[] answers =     {
                                  'A',
                                  'B',
                                  'C',
                                  'C',
                                  'B',
                                  'D',
                                  'C'
                                 
          /*  'C',
            'A',
            'C',
            'B',
            'D',
            'A',
            'C',
            'D',
            'A',
            'B',
            'A',
            'D'
*/
                         };

    // Declaration of variables
    char  guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = questions.length;
    int results;
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();
    JTextField horizontal = new JTextField();
    JTextField horizontal1 = new JTextField();
    JTextField expression = new JTextField();
    

    int seconds = 10;
// lets now invoke our JFrame
    JFrame frame = new JFrame();
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel time_label = new JLabel();

   // JTextField scanner = new JTextField();

    // still working on the timer for the future
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
         seconds--;
         seconds_left.setText(String.valueOf(seconds));
         if (seconds<0){
             displayAnswer();
         }
        }
    });



    public Quiz(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.getContentPane().setBackground(new Color(255,255,255));
        frame.setLayout(null);
        frame.setResizable(false);

        textfield.setBounds(0,0,650,50);
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(250,255,0));
        textfield.setFont(new Font("Times New Roman", Font.BOLD,30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);

        textarea.setBounds(0,50,650,50);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(25,25,25));
        textarea.setForeground(new Color(255,255,255));
        textarea.setFont(new Font("Arial", Font.BOLD,25));
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);

        buttonA.setBounds(0,100,100,100);
        buttonA.setFont(new Font("MV Boli", Font.BOLD,35));
        buttonA.setForeground(new Color(255,255,255));
        buttonA.setBackground(new Color(0,0,128));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0,200,100,100);
        buttonB.setFont(new Font("MV Boli", Font.BOLD,35));
        buttonB.setForeground(new Color(255,255,255));
        buttonB.setBackground(new Color(0,0,128));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0,300,100,100);
        buttonC.setFont(new Font("MV Boli", Font.BOLD,35));
        buttonC.setForeground(new Color(255,255,255));
        buttonC.setBackground(new Color(0,0,128));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        buttonD.setBounds(0,400,100,100);
        buttonD.setFont(new Font("MV Boli", Font.BOLD,35));
        buttonD.setForeground(new Color(255,255,255));
        buttonD.setBackground(new Color(0,0,128));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        answer_labelA.setBounds(125,100,500,100);
        answer_labelA.setBackground(new Color(50,50,50));
        answer_labelA.setForeground(new Color(25,25,25));
        answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,35));


        answer_labelB.setBounds(125,200,500,100);
        answer_labelB.setBackground(new Color(50,50,50));
        answer_labelB.setForeground(new Color(25,25,25));
        answer_labelB.setFont(new Font("MV Boli",Font.PLAIN,35));


        answer_labelC.setBounds(125,300,500,100);
        answer_labelC.setBackground(new Color(50,50,50));
        answer_labelC.setForeground(new Color(25,25,25));
        answer_labelC.setFont(new Font("MV Boli",Font.PLAIN,35));


        answer_labelD.setBounds(125,400,500,100);
        answer_labelD.setBackground(new Color(50,50,50));
        answer_labelD.setForeground(new Color(25,25,25));
        answer_labelD.setFont(new Font("MV Boli",Font.PLAIN,35));

        seconds_left.setBounds(535,510,100,100);
        seconds_left.setBackground(new Color(0,0,128));
        seconds_left.setForeground(new Color(255,255,255));
        seconds_left.setFont(new Font("Ink Free",Font.BOLD,60));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        time_label.setBounds(535,475,100,25);
        time_label.setBackground(new Color(50,50,50));
        time_label.setForeground(new Color(25,25,25));
        time_label.setFont(new Font("MV Boli",Font.PLAIN,16));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText(("Timer.SN"));

        number_right.setBounds(225,225,200,100);
        number_right.setBackground(new Color(25,25,25));
        number_right.setForeground(new Color(250,255,0));
        number_right.setFont(new Font("Ink free",Font.BOLD,50));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percentage.setBounds(225,325,200,100);
        percentage.setBackground(new Color(25,25,25));
        percentage.setForeground(new Color(250,255,0));
        percentage.setFont(new Font("Ink free",Font.BOLD,50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        horizontal.setBounds(0,510,540,50);
        horizontal.setBackground(new Color(25,25,25));
        horizontal.setForeground(new Color(250,255,0));
        horizontal.setFont(new Font("Times New Roman", Font.BOLD,20));
        horizontal.setBorder(BorderFactory.createBevelBorder(1));
        horizontal.setHorizontalAlignment(JTextField.CENTER);
        horizontal.setEditable(false);
        horizontal.setText(("Come Join Me At Rhotel Where We Code For Fun"));

        horizontal1.setBounds(0,550,540,50);
        horizontal1.setBackground(new Color(25,25,25));
        horizontal1.setForeground(new Color(250,255,0));
        horizontal1.setFont(new Font("Times New Roman", Font.BOLD,20));
        horizontal1.setBorder(BorderFactory.createBevelBorder(1));
        horizontal1.setHorizontalAlignment(JTextField.CENTER);
        horizontal1.setEditable(false);
        horizontal1.setText(("Contact: 0777973774 / 0555121056"));
        
        
        expression.setBounds(125,100,515,100);
        expression.setBackground(new Color(250,255,0));
        expression.setForeground(new Color(25,25,25));
        expression.setFont(new Font("Times New Roman", Font.BOLD,20));
        expression.setBorder(BorderFactory.createBevelBorder(1));
        expression.setHorizontalAlignment(JTextField.CENTER);
        expression.setEditable(false);
        expression.setText(("Thanks For playing Samuel Nimely  Quiz Game  "));



       // scanner.setBounds(0,500,500,25);


        //frame.add(scanner);
        frame.add(horizontal1);
        frame.add(horizontal);
        frame.add(time_label);
        frame.add(seconds_left);
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textarea);
        frame.add(textfield);
        frame.setVisible(true);

        nextQuestion();

    }public void nextQuestion(){
        if(index>=total_questions){
            results();
        }
        else{
            textfield.setText("S.N. QUIZ APP (Rhotel Innovation House) " ); // + (index + 1) this add the total index of questions
            textarea.setText(questions[index]);
            answer_labelA.setText(options[index][0]);
            answer_labelB.setText(options[index][1]);
            answer_labelC.setText(options[index][2]);
            answer_labelD.setText(options[index][3]);
           timer.start();
        }

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if(actionEvent.getSource()==buttonA){
            answer = 'A';
            if (answer == answers[index]){
                correct_guesses++;
                
            } else{
           
                    System.out.println(expression);
                    
            }
        }
        if(actionEvent.getSource()==buttonB){
            answer = 'B';
            if (answer == answers[index]){
                correct_guesses++;
                
            }
        }
        if(actionEvent.getSource()==buttonC){
            answer = 'C';
            if (answer == answers[index]){
                correct_guesses++;
            }
        }
        if(actionEvent.getSource()==buttonD){
            answer = 'D';
            if (answer == answers[index]){
                correct_guesses++;
            }
        }
        displayAnswer();
    }
    public void displayAnswer(){

       timer.stop();
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (answers[index] != 'A')
            answer_labelA.setForeground(new Color(255,0,0));
        if (answers[index] != 'B')
            answer_labelB.setForeground(new Color(255,0,0));
        if (answers[index] != 'C')
            answer_labelC.setForeground(new Color(255,0,0));
        if (answers[index] != 'D')
            answer_labelD.setForeground(new Color(255,0,0));

        Timer pause = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                answer_labelA.setForeground(new Color(25,25,25));
                answer_labelB.setForeground(new Color(25,25,25));
                answer_labelC.setForeground(new Color(25,25,25));
                answer_labelD.setForeground(new Color(25,25,25));

                answer = ' ';
                seconds = 10;
                seconds_left.setText(String.valueOf(seconds));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                index++;
                nextQuestion();
            }
        });

        pause.setRepeats(false);
        pause.start();

    }
    public void results(){
        buttonA.setEnabled(false);
        buttonA.setEnabled(false);
        buttonA.setEnabled(false);
        buttonA.setEnabled(false);


        // inorder to get our results, the total correct_guesses must be divided
        // by the totalnumber of questions * 100.
        // inorder to not have a ddouble point value e.g. 75.6, we must convert
        // the double value to an integer value.
        results = (int)((correct_guesses/(double)total_questions)*100);
        textfield.setText(" YOUR RESULTS! ");
        textarea.setText("");
        answer_labelA.setText("");
        answer_labelB.setText("");
        answer_labelC.setText("");
        answer_labelD.setText("");

//

        number_right.setText("("+correct_guesses + "/" + total_questions + ")");
        percentage.setText(results + "%");

        frame.add(percentage);
        frame.add(number_right);
        frame.add(expression);
        //In this case I want to add an  expressio for the user that will be be playing this game

    }
}
