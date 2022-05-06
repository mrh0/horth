package com.mrh0.horth.options;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Config {
    private List<String> included;

    private Optional<String> format;
    private Optional<String> arch;
    private Optional<String> input;
    private Optional<String> output;
    private Optional<String> logLevel;

    public Config() {
        included = new ArrayList<>();
        format = Optional.empty();
        arch = Optional.empty();
        input = Optional.empty();
        output = Optional.empty();
        logLevel = Optional.empty();
    }

    public List<String> getIncluded() {
        return included;
    }

    public String getFormat() {
        return format.orElse("nasm");
    }

    public String getArch() {
        return arch.orElse("elf64");
    }

    public String getInput() {
        return input.orElseThrow();
    }

    public String getOutput() {
        return output.orElse("out.asm");
    }

    public String getLogLevel() {
        return logLevel.orElse("normal");
    }

    public void setIncluded(List<String> included) {
        this.included = included;
    }

    public void addIncluded(String include) {
        this.included.add(include);
    }

    public void setFormat(String format) {
        this.format = Optional.of(format);
    }

    public void setArch(String arch) {
        this.arch = Optional.of(arch);
    }

    public void setInput(String input) {
        this.input = Optional.of(input);
    }

    public void setOutput(String output) {
        this.output = Optional.of(output);
    }

    public void setLogLevel(String level) {
        this.logLevel = Optional.of(level);
    }
}
