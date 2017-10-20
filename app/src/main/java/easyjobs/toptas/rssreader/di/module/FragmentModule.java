package easyjobs.toptas.rssreader.di.module;

import dagger.Module;
import dagger.Provides;
import easyjobs.toptas.rssreader.app.SessionData;
import easyjobs.toptas.rssreader.rss.RssContract;
import easyjobs.toptas.rssreader.rss.RssPresenter;

/**
 * Created by faruktoptas on 29/01/17.
 */

@Module
public class FragmentModule {

    @Provides
    RssContract.Presenter providesRssPresenter(SessionData sessionData) {
        return new RssPresenter(sessionData);
    }
}
