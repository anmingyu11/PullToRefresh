package com.amy.inertia.interfaces;

import com.amy.inertia.view.ScrollViewState;

public interface IAView {

    ScrollViewState getScrollViewState();

    void setInTouching(boolean inTouching);

    /**
     * Attach to inertia pull to refresh view.
     *
     * @param iPullToRefresh
     */
    void attachToParent(IPullToRefreshContainer iPullToRefresh);

    /**
     * Attach to animation controller this AnimationController is in InertiaPullToRefreshLayout.
     *
     * @param iAnimatorController
     */
    void attachToAnimatorController(IAnimatorController iAnimatorController);

    /**
     * Add a Scroll Detector listener.
     * <p>
     * Todo: ScrollDetectorListener will be implement in InertiaPullToRefreshLayout.
     *
     * @param onScrollDetectorListener
     */
    void addScrollDetectorListener(OnScrollDetectorListener onScrollDetectorListener);

    void removeScrollDetectorListener(OnScrollDetectorListener onScrollDetectorListener);

    void clearScrollDetectorListener();

    /**
     * Encapsulate the view.setTranslationY(float translationY);
     *
     * @param translationY
     */
    void setViewTranslationY(float translationY);

    /**
     * Encapsulate the view.getTranslationY();
     *
     * @return
     */
    float getViewTranslationY();
}