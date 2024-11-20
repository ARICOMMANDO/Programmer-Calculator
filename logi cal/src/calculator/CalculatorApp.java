package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {
	
    private JRadioButton dec, hex, bin;
    private JPanel radiaxPanel, calcButtonPanel, displayPanel;
    private JButton aBtn, andBtn, leftShiftBtn, rightShiftBtn, clrBtn, backBtn
            , bBtn, nandBtn, multiplyBtn, divideBtn, plusBtn, minusBtn
            , cBtn, orBtn, sevenBtn, eightBtn, nineBtn, modBtn
            , dBtn, norBtn, fourBtn, fiveBtn, sixBtn, clraBtn
            , eBtn, xorBtn, oneBtn, twoBtn, threeBtn, clrrBtn
            , fBtn, notBtn, switchSignBtn, zeroBtn, equalBtn, clroBtn;
    private JLabel accumulatorLabel, operatorLabel, registerLabel;
    
    public CalculatorApp() {
        super("Programmers Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        setSize(500, 500);
        setLocationRelativeTo(null);
        displayPanel();
        calcButtonPanel();
        radiaxPanel();
        add(displayPanel);
        add(radiaxPanel);
        add(calcButtonPanel);
        setVisible(true);
        setResizable(true);
    }
    private void displayPanel() {
        displayPanel = new JPanel();
        displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.X_AXIS));

        accumulatorLabel = new JLabel(" ");
        accumulatorLabel.setFont(new Font("Roboto", Font.BOLD, 20));

        operatorLabel = new JLabel(" ");
        operatorLabel.setFont(new Font("Open Sans Serif", Font.BOLD, 20));
        operatorLabel.setForeground(Color.GRAY);

        registerLabel = new JLabel(" ");
        registerLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        registerLabel.setForeground(Color.RED);

        displayPanel.add(accumulatorLabel);
        displayPanel.add(operatorLabel);
        displayPanel.add(registerLabel);
    }
    
    private void calcButtonPanel() {
        calcButtonPanel = new JPanel();
        calcButtonPanel.setLayout(new GridLayout(6, 6));

        aBtn = new JButton("A");
        andBtn = new JButton("And");
        leftShiftBtn = new JButton("<<");
        rightShiftBtn = new JButton(">>");
        clrBtn = new JButton("CLR");
        backBtn = new JButton("back");
        bBtn = new JButton("B");
        nandBtn = new JButton("Nand");
        multiplyBtn = new JButton("*");
        divideBtn = new JButton("/");
        plusBtn = new JButton("+");
        minusBtn = new JButton("-");
        cBtn = new JButton("C");
        orBtn = new JButton("Or");
        sevenBtn = new JButton("7");
        eightBtn = new JButton("8");
        nineBtn = new JButton("9");
        modBtn = new JButton("mod");
        dBtn = new JButton("D");
        norBtn = new JButton("Nor");
        fourBtn = new JButton("4");
        fiveBtn = new JButton("5");
        sixBtn = new JButton("6");
        clraBtn = new JButton("ClrA");
        eBtn = new JButton("E");
        xorBtn = new JButton("Xor");
        oneBtn = new JButton("1");
        twoBtn = new JButton("2");
        threeBtn = new JButton("3");
        clrrBtn = new JButton("ClrR");
        fBtn = new JButton("F");
        notBtn = new JButton("Not");
        switchSignBtn = new JButton("+/-");
        zeroBtn = new JButton("0");
        equalBtn = new JButton("=");
        clroBtn = new JButton("ClrO");

        calcButtonPanel.add(aBtn);
        calcButtonPanel.add(andBtn);
        calcButtonPanel.add(leftShiftBtn);
        calcButtonPanel.add(rightShiftBtn);
        calcButtonPanel.add(clrBtn);
        calcButtonPanel.add(backBtn);
        calcButtonPanel.add(bBtn);
        calcButtonPanel.add(nandBtn);
        calcButtonPanel.add(multiplyBtn);
        calcButtonPanel.add(divideBtn);
        calcButtonPanel.add(plusBtn);
        calcButtonPanel.add(minusBtn);
        calcButtonPanel.add(cBtn);
        calcButtonPanel.add(orBtn);
        calcButtonPanel.add(sevenBtn);
        calcButtonPanel.add(eightBtn);
        calcButtonPanel.add(nineBtn);
        calcButtonPanel.add(modBtn);
        calcButtonPanel.add(dBtn);
        calcButtonPanel.add(norBtn);
        calcButtonPanel.add(fourBtn);
        calcButtonPanel.add(fiveBtn);
        calcButtonPanel.add(sixBtn);
        calcButtonPanel.add(clraBtn);
        calcButtonPanel.add(eBtn);
        calcButtonPanel.add(xorBtn);
        calcButtonPanel.add(oneBtn);
        calcButtonPanel.add(twoBtn);
        calcButtonPanel.add(threeBtn);
        calcButtonPanel.add(clrrBtn);
        calcButtonPanel.add(fBtn);
        calcButtonPanel.add(notBtn);
        calcButtonPanel.add(switchSignBtn);
        calcButtonPanel.add(zeroBtn);
        calcButtonPanel.add(equalBtn);
        calcButtonPanel.add(clroBtn);

        aBtn.addActionListener(new calcBtnListener());
        andBtn.addActionListener(new calcBtnListener());
        leftShiftBtn.addActionListener(new calcBtnListener());
        rightShiftBtn.addActionListener(new calcBtnListener());
        clrBtn.addActionListener(new calcBtnListener());
        backBtn.addActionListener(new calcBtnListener());
        bBtn.addActionListener(new calcBtnListener());
        nandBtn.addActionListener(new calcBtnListener());
        multiplyBtn.addActionListener(new calcBtnListener());
        divideBtn.addActionListener(new calcBtnListener());
        plusBtn.addActionListener(new calcBtnListener());
        minusBtn.addActionListener(new calcBtnListener());
        cBtn.addActionListener(new calcBtnListener());
        orBtn.addActionListener(new calcBtnListener());
        sevenBtn.addActionListener(new calcBtnListener());
        eightBtn.addActionListener(new calcBtnListener());
        nineBtn.addActionListener(new calcBtnListener());
        modBtn.addActionListener(new calcBtnListener());
        dBtn.addActionListener(new calcBtnListener());
        norBtn.addActionListener(new calcBtnListener());
        fourBtn.addActionListener(new calcBtnListener());
        fiveBtn.addActionListener(new calcBtnListener());
        sixBtn.addActionListener(new calcBtnListener());
        clraBtn.addActionListener(new calcBtnListener());
        eBtn.addActionListener(new calcBtnListener());
        xorBtn.addActionListener(new calcBtnListener());
        oneBtn.addActionListener(new calcBtnListener());
        twoBtn.addActionListener(new calcBtnListener());
        threeBtn.addActionListener(new calcBtnListener());
        clrrBtn.addActionListener(new calcBtnListener());
        fBtn.addActionListener(new calcBtnListener());
        notBtn.addActionListener(new calcBtnListener());
        switchSignBtn.addActionListener(new calcBtnListener());
        zeroBtn.addActionListener(new calcBtnListener());
        equalBtn.addActionListener(new calcBtnListener());
        clroBtn.addActionListener(new calcBtnListener());
        
        aBtn.setEnabled(false);
        bBtn.setEnabled(false);
        cBtn.setEnabled(false);
        dBtn.setEnabled(false);
        eBtn.setEnabled(false);
        fBtn.setEnabled(false);
    }

    private void radiaxPanel() {
        radiaxPanel = new JPanel();
        radiaxPanel.setLayout(new BoxLayout(radiaxPanel, BoxLayout.X_AXIS));
        dec = new JRadioButton("dec");
        hex = new JRadioButton("hex");
        bin = new JRadioButton("bin");
        ButtonGroup group = new ButtonGroup();
        group.add(dec);
        group.add(hex);
        group.add(bin);
        dec.setSelected(true);
        dec.addActionListener(new displayChoiceListener());
        hex.addActionListener(new displayChoiceListener());
        bin.addActionListener(new displayChoiceListener());
        radiaxPanel.add(dec);
        radiaxPanel.add(hex);
        radiaxPanel.add(bin);
    }
    
    public class calcBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            String buttonText = clickedButton.getText();

            if (buttonText.matches("[A-F0-9]")) {
                handleDigitButton(buttonText);
            } else if (buttonText.equals("CLR")) {
                clear();
            } else if (buttonText.equals("back")) {
                backspace();
            } else if (buttonText.equals("+/-")) {
                switchSign();
            } else if (buttonText.equals("=")) {
                calculateResult();
            } else {
                handleOperatorButton(buttonText);
            }
        }

        private void handleDigitButton(String digit) {
            if (accumulatorLabel.getText().equals(" ")) {
                accumulatorLabel.setText(digit);
            } else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" ")) {
                registerLabel.setText(digit);
            } else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" ")) {
                registerLabel.setText(registerLabel.getText() + digit);
            } else {
                accumulatorLabel.setText(accumulatorLabel.getText() + digit);
            }
        }

        private void handleOperatorButton(String operator) {
            operatorLabel.setText(operator);
        }

        private void clear() {
            accumulatorLabel.setText(" ");
            operatorLabel.setText(" ");
            registerLabel.setText(" ");
        }

        private void backspace() {
            String registerText = registerLabel.getText();
            if (!registerText.equals(" ")) {
                registerLabel.setText(registerText.length() == 1 ? " " : registerText.substring(0, registerText.length() - 1));
            } else if (!operatorLabel.getText().equals(" ")) {
                operatorLabel.setText(" ");
            } else {
                String accumulatorText = accumulatorLabel.getText();
                accumulatorLabel.setText(accumulatorText.length() == 1 ? " " : accumulatorText.substring(0, accumulatorText.length() - 1));
            }
        }

        private void switchSign() {
            String labelToModify = registerLabel.getText().equals(" ") ? accumulatorLabel.getText() : registerLabel.getText();

            if (!labelToModify.equals(" ")) {
                labelToModify = labelToModify.charAt(0) == '-' ? labelToModify.substring(1) : "-" + labelToModify;
                if (registerLabel.getText().equals(" ")) {
                    accumulatorLabel.setText(labelToModify);
                } else {
                    registerLabel.setText(labelToModify);
                }
            }
        }

        private void calculateResult() {
            int result = 0;
            Calculator calc = new Calculator();

            if (operatorLabel.getText().equals(" ")) {
                registerLabel.setText(accumulatorLabel.getText());
            }

            int decimalAccumulator = Integer.parseInt(accumulatorLabel.getText(), getCurrentBase());
            int decimalRegister = Integer.parseInt(registerLabel.getText(), getCurrentBase());

            try {
                result = calc.calculate(decimalAccumulator, decimalRegister, operatorLabel.getText());
            } catch (Calculator.IllegalOperationException | Calculator.InvalidOperandException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            accumulatorLabel.setText(" ");
            registerLabel.setText(Integer.toString(result, getCurrentBase()));
            operatorLabel.setText(" ");
        }
    }
    private int getCurrentBase() {
        if (aBtn.isEnabled()) return 16;
        if (!threeBtn.isEnabled()) return 2;
        return 10;
    }
    public class displayChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("0");
            if (registerLabel.getText().equals(" ")) registerLabel.setText("0");
            int decimalAccumulator = Integer.parseInt(accumulatorLabel.getText(), getCurrentBase());
            int decimalRegister = Integer.parseInt(registerLabel.getText(), getCurrentBase());
            if (e.getSource() == dec) {
                aBtn.setEnabled(false);
                bBtn.setEnabled(false);
                cBtn.setEnabled(false);
                dBtn.setEnabled(false);
                eBtn.setEnabled(false);
                fBtn.setEnabled(false);
                twoBtn.setEnabled(true);
                threeBtn.setEnabled(true);
                fourBtn.setEnabled(true);
                fiveBtn.setEnabled(true);
                sixBtn.setEnabled(true);
                sevenBtn.setEnabled(true);
                eightBtn.setEnabled(true);
                nineBtn.setEnabled(true);
                accumulatorLabel.setText(Integer.toString(decimalAccumulator));
                registerLabel.setText(Integer.toString(decimalRegister));
            } else if (e.getSource() == hex) {
                aBtn.setEnabled(true);
                bBtn.setEnabled(true);
                cBtn.setEnabled(true);
                dBtn.setEnabled(true);
                eBtn.setEnabled(true);
                fBtn.setEnabled(true);
                twoBtn.setEnabled(true);
                threeBtn.setEnabled(true);
                fourBtn.setEnabled(true);
                fiveBtn.setEnabled(true);
                sixBtn.setEnabled(true);
                sevenBtn.setEnabled(true);
                eightBtn.setEnabled(true);
                nineBtn.setEnabled(true);
                accumulatorLabel.setText(Integer.toHexString(decimalAccumulator));
                registerLabel.setText(Integer.toHexString(decimalRegister));
            } else if (e.getSource() == bin) {
                aBtn.setEnabled(false);
                bBtn.setEnabled(false);
                cBtn.setEnabled(false);
                dBtn.setEnabled(false);
                eBtn.setEnabled(false);
                fBtn.setEnabled(false);
                twoBtn.setEnabled(false);
                threeBtn.setEnabled(false);
                fourBtn.setEnabled(false);
                fiveBtn.setEnabled(false);
                sixBtn.setEnabled(false);
                sevenBtn.setEnabled(false);
                eightBtn.setEnabled(false);
                nineBtn.setEnabled(false);
                accumulatorLabel.setText(Integer.toBinaryString(decimalAccumulator));
                registerLabel.setText(Integer.toBinaryString(decimalRegister));
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }

}