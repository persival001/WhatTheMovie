package com.persival.whatthemovie.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Result implements Parcelable {
    //Parcelable implementation
    public final static Creator<Result> CREATOR = new Creator<Result>() {
        @Override
        public Result createFromParcel(Parcel parcel) {
            return new Result(parcel);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }
    };
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("results")
    @Expose
    private List<Movie> results;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;

    public Result() {
    }

    public Result(Parcel in) {
        this.page = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.results, (Movie.class.getClassLoader()));
        this.totalResults = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.totalPages = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(page);
        parcel.writeList(results);
        parcel.writeValue(totalResults);
        parcel.writeValue(totalPages);
    }
}

