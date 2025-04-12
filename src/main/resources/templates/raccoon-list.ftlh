<!doctype html>
<html lang="en">

<style>

    h1 {
    text-align: center;
}
    .card-img-top {
    max-height: 200px;
    min-height: 150px;
    object-fit: cover;
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
<h1>Welcome to Raccoon World!</h1>

<div class="container">
    <div class="row">
        <div class="col-lg-auto d-flex">

            <#list raccoonList as raccoon>
            <div class="card" style="width: 18rem;">
                <img src="https://shorturl.at/N84sH" class="card-img-top" alt="Raccoon">
                <div class="card-body">
                    <h5 class="card-text"> ${raccoon.name}</h5>
                    <a href="/raccoons/${raccoon.raccoonId?c}"> ID: ${raccoon.raccoonId}</a>
                    <li>Species: ${raccoon.species}</li>
                    <li>Size: ${raccoon.size}</li>
                    <li>Weight: ${raccoon.weight}}</li>
                </div>
                <a href="/raccoons/update/${raccoon.raccoonId?c}" class="btn btn-primary">Edit</a>
                <a href="/raccoons/delete/${raccoon.raccoonId?c}" class="btn btn-outline-danger" >Delete</a>
            </div>
            </#list>
        <div class="card" style="width: 18rem;">

            <div class="card-body">
                <h1>
                    <a href="/raccoons/createForm"> Add New Raccoon</a>
                </h1>
            </div>
        </div>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <div style="padding:6px;">
                <p>The raccoon also spelled racoon and sometimes called the common raccoon or northern raccoon to
                    distinguish it from the other species, is a mammal native to North America. It is the largest of the
                    procyonid family, having a body length of 40 to 70 cm (16 to 28 in), and a body weight of 5 to 26 kg
                    (11 to 57 lb). Its grayish coat mostly consists of dense underfur, which insulates it against cold
                    weather. The animal's most distinctive features include its extremely dexterous front paws, its
                    facial mask, and its ringed tail, which are common themes in the mythologies of the Indigenous
                    peoples of the Americas surrounding the species. The raccoon is noted for its intelligence, and
                    studies show that it is able to remember the solution to tasks for at least three years. It is
                    usually nocturnal and omnivorous, eating about 40% invertebrates, 33% plants, and 27%
                    vertebrates.</p>
            </div>
        </div>
    </div>
</div>
</div>


<div class="clearfix"></div>


</body>
</html>