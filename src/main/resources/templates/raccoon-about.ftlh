<!doctype html>
<html lang="en">

<style>


    h1 {
    text-align: center;
}

    .inner-carousel-container {
    height: 400px;
    width: 700px;
    }

    .carousel-item img {
     height: 360px;
      width: 640px;
      object-fit: contain !important;
  display: block;
  background-color: #f0f0f0;
     }

</style>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="/raccoons/all">
            <img src="data:image/png;base64,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"
                 alt="racoonworld" width="30" height="24">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/raccoons/all">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/raccoons/about">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" aria-disabled="true">Administrator</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Raccoons</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>


<body>
<div class="container">
    <h1>About</h1>
</div>


<div class="carouselContainer">
    <div class="row">

        <div class="col">
            <div class="container inner-carousel-container">
                <div id="carouselExampleAutoplaying" class="carousel slide" data-bs-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="https://tinyurl.com/ru3vf394" class="d-block w-100 mx-auto" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="https://tinyurl.com/4u4uuzvw" class="d-block w-100 mx-auto" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="https://tinyurl.com/3jz44yyj" class="d-block w-100 mx-auto" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="https://tinyurl.com/2s4by6x7" class="d-block w-100 mx-auto" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="https://tinyurl.com/3hu3a9yf" class="d-block w-100 mx-auto" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="https://tinyurl.com/33tft8r5" class="d-block w-100 mx-auto" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="https://tinyurl.com/5665uvcb" class="d-block w-100 mx-auto" alt="...">
                        </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleAutoplaying"
                            data-bs-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleAutoplaying"
                            data-bs-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                    </button>
                </div>
            </div>
        </div>

        <div>

        </div>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col">
            <h2>Why Raccoons Are Out During the Day</h2>
            <p>Raccoons may come out during the day if there are food sources available at that time. If they have been
                frightened or displaced,
                or there are other competing animals, they may be relocating. A red flag to look for is a loss of
                balance. This may indicate signs
                of a sick raccoon. It is best not to approach a raccoon at all.</p>
            <h3>Why are raccoons dangerous?</h3>
            <p>Raccoons are known to carry rabies, fleas, distemper, roundworm, etc. These animals are also known to be
                dumpster divers, which involve various levels of contamination or uncleanliness. Defense mechanisms for
                the raccoon can include hissing and puffing themselves up
                , but do not forget that raccoons will also bite.</p>
            <p>Raccoons are wild animals. They are unpredictable and mischievous. They are cat-like and have the ability
                to climb
                and are generally known to explore.</p>
            <h3>Why raccoons are important</h3>
            <p>Raccoons play an important part in the ecosystem. They feed on many potential pests such as insects, but
                they also eat
                decaying flesh of dead animals (carrion, roadkill, etc). Rodends, such as mouses, rats, and chipmunks
                are also a portion of
                a raccoon's possible diet, but they are also omnivores. Raccoons also assist in pollination by feeding
                on berries and nuts,
                and the raccoon feces help to spread the pollen further around the surrounding environment.</p>
            <h3>Raccoons are fat</h3>
            <p>The normal diet of a raccon is about 40% invertibrates, 33% plants, and 27% vertebrates. They often have
                a wide range of areas to forage for food, which include dumpsters from cities, pet food, gardens, and decomposing carrion.
                The raccoon gets fat the same way that people do, which is by eating more and exercising less.</p>
        </div>
    </div>
</div>

</body>
</html>