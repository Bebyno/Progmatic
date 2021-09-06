package model;

public class Program {

        private String code;
        private String title;
        private Genre genre;
        private Integer ageLimit;
        private Integer occurrences = 0;

        public Program(String[] data) {
                this.code = data[0];
                this.title = data[1];
                this.genre = Genre.getGenreByNAME(data[2]);
                try {
                        this.ageLimit = Integer.parseInt(data[3]);
                } catch(NumberFormatException e){
                        this.ageLimit = 0;
                }
        }

        public Program(String code, String title, Genre genre, Integer ageLimit) {
                this.code = code;
                this.title = title;
                this.genre = genre;
                this.ageLimit = ageLimit;
        }

        public String getCode() {
                return code;
        }

        public void setCode(String code) {
                this.code = code;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public Genre getGenre() {
                return genre;
        }

        public void setGenre(Genre genre) {
                this.genre = genre;
        }

        public Integer getAgeLimit() {
                return ageLimit;
        }

        public void setAgeLimit(Integer ageLimit) {
                this.ageLimit = ageLimit;
        }

        public void increaseOccurrences() {
                occurrences++;
        }

        public Integer getOccurrences() {
                return occurrences;
        }
}
