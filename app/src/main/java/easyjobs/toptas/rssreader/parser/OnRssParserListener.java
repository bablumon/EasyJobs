package easyjobs.toptas.rssreader.parser;

import java.util.List;

import easyjobs.toptas.rssreader.model.RssItem;

/**
 * Created by faruktoptas on 29/01/17.
 */

public interface OnRssParserListener {

    void onSuccess(List<RssItem> rssItemList, String rssUrl);

    void onFail(String rssUrl);
}
