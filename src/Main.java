public class Main {
    public static void main(String [] args){
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(hawthorn);
        footballLeague.addTeam(fremantle);
        footballLeague.addTeam(melbourne);

//        footballLeague.addTeam(baseballTeam); // does not work.
        hawthorn.matchResult(fremantle, 1,0);
        hawthorn.matchResult(adelaideCrows, 1,0);

        adelaideCrows.matchResult(fremantle,2,1);

        footballLeague.showLeagueTable();


    }
}
