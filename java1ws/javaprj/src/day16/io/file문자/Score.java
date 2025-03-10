package day16.io.file문자;

class Score  {
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;
    private double avg;    
    private char grade;
    

    public Score (String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        
        
        //
        calculateGrade();
        
        
    }

    public String getName() {
        return name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }
    
    

    public double getAvg() {
		return avg;
	}

	public char getGrade() {
		return grade;
	}

	private void calculateAverage() {
        avg= (koreanScore + englishScore + mathScore) / 3.0;
    }

    private void calculateGrade() {
          calculateAverage();
        if (avg >= 90) {
            this.grade= 'A';
        } else if (avg >= 80) {
        	 this.grade= 'B';
        } else if (avg >= 70) {
        	 this.grade= 'C';
        } else if (avg >= 60) {
        	 this.grade= 'D';
        } else {
        	 this.grade= 'F';
        }
    }
}