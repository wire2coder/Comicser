package com.sedsoftware.comicser.features.issueslist;

import com.hannesdorfmann.mosby3.mvp.lce.MvpLceView;
import com.sedsoftware.comicser.data.model.ComicIssueInfoList;
import java.util.List;

public interface IssuesView extends MvpLceView<List<ComicIssueInfoList>> {

//  Already defined by Mosby:
//  void showLoading(boolean pullToRefresh);
//  void showContent();
//  void showError(Throwable e, boolean pullToRefresh);
//  void setData(List<ComicIssueInfoList> data);
//  void loadData(boolean pullToRefresh);

  void choseDateAndLoadData();

  void loadDataForChosenDate(String date);

  void setTitle(String title);

  void showEmptyView(boolean show);
}