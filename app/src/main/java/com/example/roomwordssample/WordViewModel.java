package com.example.roomwordssample;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel(Application application) {
        super(application);
        this.mRepository = new WordRepository(application);
        this.mAllWords = mRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return this.mAllWords;
    }

    public void insert(Word word) {
        mRepository.insert(word);
    }
}
