package ex_024_Enum;

public enum Youtube {
     //Songs
    WAVY("https://www.youtube.com/watch?v=XTp5jaRU3Ws"),
     Magnitude ("https://www.youtube.com/watch?v=KYLtx_6Rwps");
    private String Songs;

    public String getSongs() {
        return Songs;
    }

    Youtube(String Songs){
        this.Songs=Songs;
    }



}
//WAVY — https://www.youtube.com/watch?v=XTp5jaRU3Ws
//
//YouTube
//
//7.7 Magnitude — https://www.youtube.com/watch?v=KYLtx_6Rwps