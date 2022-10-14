/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
/**
 * FXML Controller class
 *
 * @author Caleb Cope
 */
public class BoardController implements Initializable  {
    @FXML
    private ImageView backgroundImage;
    @FXML
    private Rectangle space10;
    @FXML
    private Rectangle space20;
    @FXML
    private Rectangle space0;
    @FXML
    private Rectangle space30;
    @FXML
    private Rectangle space19;
    @FXML
    private Rectangle space18;
    @FXML
    private Rectangle space17;
    @FXML
    private Rectangle space16;
    @FXML
    private Rectangle space1913;
    @FXML
    private Rectangle space15;
    @FXML
    private Rectangle space14;
    @FXML
    private Rectangle space13;
    @FXML
    private Rectangle space12;
    @FXML
    private Rectangle space11;
    @FXML
    private Rectangle space31;
    @FXML
    private Rectangle space32;
    @FXML
    private Rectangle space33;
    @FXML
    private Rectangle space34;
    @FXML
    private Rectangle space35;
    @FXML
    private Rectangle space36;
    @FXML
    private Rectangle space37;
    @FXML
    private Rectangle space38;
    @FXML
    private Rectangle space39;
    @FXML
    private Rectangle space9;
    @FXML
    private Rectangle space8;
    @FXML
    private Rectangle space6;
    @FXML
    private Rectangle space7;
    @FXML
    private Rectangle space5;
    @FXML
    private Rectangle space4;
    @FXML
    private Rectangle space3;
    @FXML
    private Rectangle space2;
    @FXML
    private Rectangle space1;
    @FXML
    private Rectangle space21;
    @FXML
    private Rectangle space22;
    @FXML
    private Rectangle space24;
    @FXML
    private Rectangle space23;
    @FXML
    private Rectangle space25;
    @FXML
    private Rectangle space26;
    @FXML
    private Rectangle space27;
    @FXML
    private Rectangle space28;
    @FXML
    private Rectangle space29;
    @FXML
    private Rectangle brown1;
    @FXML
    private Rectangle brown2;
    @FXML
    private Rectangle black1;
    @FXML
    private Rectangle black2;
    @FXML
    private Rectangle black3;
    @FXML
    private Rectangle black4;
    @FXML
    private Rectangle lightBlue1;
    @FXML
    private Rectangle lightBlue2;
    @FXML
    private Rectangle lightBlue3;
    @FXML
    private Rectangle magenta1;
    @FXML
    private Rectangle magenta2;
    @FXML
    private Rectangle magenta3;
    @FXML
    private Rectangle orange1;
    @FXML
    private Rectangle orange2;
    @FXML
    private Rectangle orange3;
    @FXML
    private Rectangle red1;
    @FXML
    private Rectangle red2;
    @FXML
    private Rectangle red3;
    @FXML
    private Rectangle yellow1;
    @FXML
    private Rectangle yellow2;
    @FXML
    private Rectangle yellow21;
    @FXML
    private Rectangle green1;
    @FXML
    private Rectangle green2;
    @FXML
    private Rectangle green3;
    @FXML
    private Rectangle darkBlue1;
    @FXML
    private Rectangle darkBlue2;
    @FXML
    private Rectangle jail1;
    @FXML
    private Rectangle jail2;
    @FXML
    private Rectangle logoBG;
    @FXML
    private Text logo;
    @FXML
    private Rectangle communityChest;
    @FXML
    private Rectangle chance;
    @FXML
    public Circle p1_token;
    @FXML
    public Circle p2_token;
    @FXML
    public Circle p3_token;
    @FXML
    public Circle p4_token;
    @FXML
    private Button roll_button;
    @FXML
    private Label die1_label;
    @FXML
    private Label die2_label;
    @FXML
    private Button move_button;
    @FXML
    private RadioButton p1_choice;
    @FXML
    private RadioButton p2_choice;
    @FXML
    private RadioButton p3_choice;
    @FXML
    private RadioButton p4_choice;
    @FXML
    private Button list_button;
    @FXML
    private Label currentSpace_label;
    @FXML
    private Label currentPlayer_label;
    @FXML
    private Label p1_nam;
    @FXML
    private Label p1_pos;
    @FXML
    private Label p1_mon;
    @FXML
    private Label p1_props;
    @FXML
    private Label p2_nam;
    @FXML
    private Label p2_pos;
    @FXML
    private Label p2_mon;
    @FXML
    private Label p2_props;
    @FXML
    private Label p3_nam;
    @FXML
    private Label p3_pos;
    @FXML
    private Label p3_mon;
    @FXML
    private Label p3_props;
    @FXML
    private Label p4_nam;
    @FXML
    private Label p4_pos;
    @FXML
    private Label p4_mon;
    @FXML
    private Label p4_props;
    @FXML
    public Button propertyYes_button;
    @FXML
    public Button propertyNo_button;
    
    Rectangle rect = new Rectangle();  // import the built rectangle class for Javafx app..
                                       // Set height, Width and X and Y axis.
    
    
    Bank bank = new Bank();
    Space[] all_spaces = createSpaces(bank.all_properties);
    Player player1 = new Player("Player 1", 565, 565, Color.rgb(255, 31, 116));
    Player player2 = new Player("Player 2", 585, 565, Color.rgb(255, 31, 116));
    Player player3 = new Player("Player 3", 565, 585, Color.rgb(255, 31, 116));
    Player player4 = new Player("Player 4", 585, 585, Color.rgb(255, 31, 116));
    //Player[] all_players = {player1, player2, player3, player4};
    ArrayList<Player> all_players = new ArrayList<Player>(Arrays.asList(player1, player2, player3, player4));
    int current_player = 0;
    Space current_space = all_spaces[0];
    int doubles_counter = 0;

    public BoardController() throws IOException {
        player1.is_up = true;
    }
    
    void list_spaces() {
        for (int i = 0; i < 40; i++) {
            System.out.println(all_spaces[i].name);
        }
    }    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        backgroundImage.setImage(new Image("uahbg.jpg"));
        //backgroundImage.setImage(new Image("th bg.png"));
        p1_nam.setText(player1.name);
        p2_nam.setText(player2.name);
        p3_nam.setText(player3.name);
        p4_nam.setText(player4.name);
        p1_pos.setText(all_spaces[0].name);
        p2_pos.setText(all_spaces[0].name);
        p3_pos.setText(all_spaces[0].name);
        p4_pos.setText(all_spaces[0].name);
        p1_mon.setText(Integer.toString(player1.playerMoney));
        p2_mon.setText(Integer.toString(player2.playerMoney));
        p3_mon.setText(Integer.toString(player3.playerMoney));
        p4_mon.setText(Integer.toString(player4.playerMoney));
        p1_props.setText("");
        p2_props.setText("");
        p3_props.setText("");
        p4_props.setText("");
        
    }    
    
    int findCurrentPlayer() {
        if (player1.is_up)
            return 0;
        else if (player2.is_up)
            return 1;
        else if (player2.is_up)
            return 2;
        else if (player2.is_up)
            return 3;
        else return 4;
    }
    
    @FXML
    private void update_pos(ActionEvent event) throws InterruptedException {
        int die1 = Integer.parseInt(die1_label.getText());
        int die2 = Integer.parseInt(die2_label.getText());
        int diceroll = die1 + die2;
        List<TranslateTransition> movements = new ArrayList();
        if (all_players.get(current_player).position == 40) {
            all_players.get(current_player).position = 10;
        }
        
        if ((die1 == die2) && (doubles_counter == 2)) {
            switch (current_player) {
                case 0: movements = go_to_jail(p1_token, movements);
                break;
                case 1: movements = go_to_jail(p2_token, movements);
                break;
                case 2: movements = go_to_jail(p3_token, movements);
                break;
                case 3: movements = go_to_jail(p4_token, movements);
                break;
            }
            doubles_counter = -1;
            diceroll = 0;
            all_players.get(current_player).position = 40;
            current_player++;
            if (current_player == 4) {
                current_player = 0;
            }
            currentPlayer_label.setText(all_players.get(current_player).name);
        }
        
        while (diceroll > 0) {
            all_players.get(current_player).position += 1;
            if (all_players.get(current_player).position == 40)
                all_players.get(current_player).position -= 40;
            diceroll -= 1;
            switch (current_player) {
                case 0: movements = move_piece(p1_token, all_players.get(current_player).position, movements);
                break;
                case 1: movements = move_piece(p2_token, all_players.get(current_player).position, movements);
                break;
                case 2: movements = move_piece(p3_token, all_players.get(current_player).position, movements);
                break;
                case 3: movements = move_piece(p4_token, all_players.get(current_player).position, movements);
                break;
            }
            //movements = move_piece(all_players[current_player].player_token, all_players[current_player].position, movements);
            //movements = go_to_jail(all_players[current_player].player_token, movements);
        }
        if (all_players.get(current_player).position == 30) {
            all_players.get(current_player).position = 40;
            switch (current_player) {
                case 0: movements = go_to_jail(p1_token, movements);
                break;
                case 1: movements = go_to_jail(p2_token, movements);
                break;
                case 2: movements = go_to_jail(p3_token, movements);
                break;
                case 3: movements = go_to_jail(p4_token, movements);
                break;
            }
        }

        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(movements);
        sequentialTransition.play();
        
        all_spaces[all_players.get(current_player).position].handleEvent(all_players.get(current_player));
                
        if (die1 != die2) {
            all_players.get(current_player).is_up = false;
            current_player++;
            if (current_player == 4) {
                current_player = 0;
            }
            all_players.get(current_player).is_up = true;
            doubles_counter = 0;
            currentPlayer_label.setText(all_players.get(current_player).name);
            switch (current_player) {
                case 0: p1_choice.setSelected(true);
                break;
                case 1: p2_choice.setSelected(true);
                break;
                case 2: p3_choice.setSelected(true);
                break;
                case 3: p4_choice.setSelected(true);
                break;
            }
        }
        else {
            doubles_counter++;
        }
        current_space = all_spaces[all_players.get(current_player).position];
        currentSpace_label.setText(current_space.name);
        roll_button.setDisable(false);
        move_button.setDisable(true);
        updatePlayerInfo();
    }
    
    @FXML
    private void roll_dice(ActionEvent event) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(6) + 1;
        int rand_int2 = rand.nextInt(6) + 1;
        String s1 = String.valueOf(rand_int1);
        String s2 = String.valueOf(rand_int2);
        die1_label.setText(s1);
        die2_label.setText(s2);
        roll_button.setDisable(true);
        move_button.setDisable(false);
    }
    
    @FXML
    private void sel_p1(ActionEvent event) {
        player1.is_up = true;
        player2.is_up = false;
        player3.is_up = false;
        player4.is_up = false;
        
        current_player = 0;
        currentPlayer_label.setText(all_players.get(current_player).name);
        currentSpace_label.setText(all_spaces[all_players.get(current_player).position].name);
    }
    @FXML
    private void sel_p2(ActionEvent event) {
        player1.is_up = false;
        player2.is_up = true;
        player3.is_up = false;
        player4.is_up = false;
        
        current_player = 1;
        currentPlayer_label.setText(all_players.get(current_player).name);
        currentSpace_label.setText(all_spaces[all_players.get(current_player).position].name);
    }
    @FXML
    private void sel_p3(ActionEvent event) {
        player1.is_up = false;
        player2.is_up = false;
        player3.is_up = true;
        player4.is_up = false;
        
        current_player = 2;
        currentPlayer_label.setText(all_players.get(current_player).name);
        currentSpace_label.setText(all_spaces[all_players.get(current_player).position].name);
    }
    @FXML
    private void sel_p4(ActionEvent event) {
        player1.is_up = false;
        player2.is_up = false;
        player3.is_up = false;
        player4.is_up = true;
        
        current_player = 3;
        currentPlayer_label.setText(all_players.get(current_player).name);
        currentSpace_label.setText(all_spaces[all_players.get(current_player).position].name);
    }
    
    private List<TranslateTransition> go_to_jail(Circle token, 
            List<TranslateTransition> movelist) {
        TranslateTransition t = new TranslateTransition();
        t.setNode(token);
        t.setToX(38 - 565);
        t.setToY(543 - 565);
        movelist.add(t);
        return movelist;
    }
    
    private List<TranslateTransition> move_piece(Circle token, int p_pos, 
            List<TranslateTransition> movelist) throws InterruptedException {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(token);
            
        if (p_pos == 0) { 
            translate.setToX(565-565);
            translate.setToY(565-565);
            all_players.get(current_player).playerMoney += 200;
        }
        else if (p_pos == 1) {
            translate.setToX(487-565);
        }
        else if ((p_pos >= 2) && (p_pos < 10)) {
            translate.setByX(-50);
        }
        else if (p_pos == 10) {
            if (player1.is_up) {
                translate.setToX(10-565);
                translate.setToY(546-565);
            }
            else if (player2.is_up) {
                translate.setToX(-10-565);
                translate.setToY(571-565);
            }
            else if (player3.is_up) {
                translate.setToX(30-565);
                translate.setToY(570-565);
            }
            else if (player4.is_up) {
                translate.setToX(45-565);
                translate.setToY(570-565);
            }
        }
        else if (p_pos == 11) {
            translate.setToX(17-565);
            translate.setToY(490-565);
        }
        else if ((p_pos >= 12) && (p_pos < 20)) {
            translate.setByY(-50);
        }
        else if (p_pos == 20) {
            translate.setToX(17-565);
            translate.setToY(38-565);
        }
        else if (p_pos == 21) {
            translate.setToX(87-565);
            translate.setToY(19-565);
        }
        else if ((p_pos >= 22) && (p_pos < 30)) {
            translate.setByX(50);
        }
        else if (p_pos == 30) {
            translate.setToX(557-565);
            translate.setToY(38-565);
        }
        else if (p_pos == 31) {
            translate.setToY(90-565);
        }
        else {
            translate.setByY(50);
        }
        movelist.add(translate);
        return movelist;
    }
    
    @FXML
    private void list_properties(ActionEvent event) {
        int iter = 0;
        while (iter < 28) {
            bank.all_properties.get(iter).printInfo();
            iter++;
        }
    }
    
    Space[] createSpaces(ArrayList<Property> property_list) {
        Space[] spaces = new Space[41];
        
        // ===== Create miscellaneous spaces =====
        spaces[0] = new GoSpace();
        spaces[4] = new IncomeTaxSpace();
        spaces[38] = new LuxuryTaxSpace();
        spaces[10] = new JustVisitingSpace();
        spaces[40] = new JailSpace();
        spaces[20] = new FreeParkingSpace();
        spaces[30] = new GoToJailSpace();

        // ===== Create property spaces =====
        int iter = 0;
        while (iter < 28) {
            spaces[property_list.get(iter).position] = new PropertySpace(property_list.get(iter));
            iter++;
        }

        // ===== Create Chance & Community Chest spaces =====
        spaces[2] = new CommunityChestSpace(2);
        spaces[17] = new CommunityChestSpace(17);
        spaces[33] = new CommunityChestSpace(33);
        spaces[7] = new ChanceSpace(7);
        spaces[22] = new ChanceSpace(22);
        spaces[36] = new ChanceSpace(36);
        
        
        
        return spaces;
    }
    
    void updatePlayerInfo() {
        //player 1
        p1_pos.setText(all_spaces[player1.position].name);
        p1_mon.setText(Integer.toString(player1.playerMoney));
        
        //player 2
        p2_pos.setText(all_spaces[player2.position].name);
        p2_mon.setText(Integer.toString(player2.playerMoney));
        
        //player 3
        p3_pos.setText(all_spaces[player3.position].name);
        p3_mon.setText(Integer.toString(player3.playerMoney));
        
        //player 4
        p4_pos.setText(all_spaces[player4.position].name);
        p4_mon.setText(Integer.toString(player4.playerMoney));
    }
}