package rs.ac.ni.pmf.oop2.primeri;

import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.ollama.OllamaModel;

public class Demo {
    /**
     * The main method serves as the entry point to the application
     * and demonstrates the usage of the Student class by creating an instance
     * and printing it to the console.
     *
     * @param args command-line arguments passed to the program
     */
    public static void main(final String[] args) {
        final OllamaChatModel model = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("llama3.2")
                .temperature(0.7)
                .build();

        final String response = model.generate("Tell me a joke");
        System.out.println(response);
    }
}
