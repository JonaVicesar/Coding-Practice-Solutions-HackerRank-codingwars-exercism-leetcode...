package exercism;

import java.util.ArrayList;
import java.util.List;

public class LanguagesList {
	private final List<String> languages = new ArrayList<>();
	public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
    	languages.add(language);

    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
    	return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        boolean itIsExciting = (languages.contains("Java") ||languages.contains("Kotlin") );
        return itIsExciting;

        
    }
}
